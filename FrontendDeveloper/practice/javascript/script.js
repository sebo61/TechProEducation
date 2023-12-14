let urunAdi="İphone";
let urunFiyat=15000;

console.log(typeof urunAdi);
console.log(typeof urunFiyat);

let sayi1="10";
let sayi2="20";

console.log(Number(sayi1)+Number(sayi2));

console.log(sayi1.toString()+ sayi2.toString());

let sinavNotu=30;
let basarilimi= (sinavNotu>50);

console.log(basarilimi);

let yas="";

console.log(yas);
console.log(typeof yas);

console.log("********************************************************************")
let ogrAdi_1="ada bilgi";
let dogumtarihi_1=2012;

let not1_1=70;
let not2_1=70;
let not3_1=80;

let ogrAdi_2="yiğit bilgi";
let dogumTarihi_2=2010;
let not1_2=40;
let not2_2=40;
let not3_2=40;

let notOrtalama_1=(not1_1+not2_1+not3_1)/3;

let notOrtalama_2=(not1_2+not2_2+not3_2)/3;

let basarili_1=(notOrtalama_1>=50);
let basarili_2=(notOrtalama_2>=50);


let suankiyil=new Date().getFullYear();

let ogr1_yas=suankiyil-dogumtarihi_1;
console.log(ogr1_yas);

let ogr2_yas=suankiyil - dogumTarihi_2;
console.log(ogr2_yas);

console.log(basarili_1);
console.log(basarili_2);



