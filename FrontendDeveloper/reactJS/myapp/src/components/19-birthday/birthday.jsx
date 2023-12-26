import React, { useState } from "react";
import { Button, Container } from "react-bootstrap";
import data from "./people.json";
import Person from "./person";
const Birthday = () => {
    const [people, setPeople] = useState(data)
    return (
        <Container className="my-3 py-3">
            <h1>Bugün Doğanlar</h1>
            <p>Doğum günü bugün olan {people.length} kişi bulundu</p>
            {people.map((item) => (
                <Person key={item.id} {...item} />
            ))}
            <Button variant="danger" onClick={()=> setPeople([])}>Temizle</Button>
            <Button variant="info" onClick={()=> setPeople(data)}>Yenile</Button>
        </Container>
    );
};
export default Birthday;
