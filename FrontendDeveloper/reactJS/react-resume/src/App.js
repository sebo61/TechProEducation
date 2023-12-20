import React from 'react'
import Header from './components/header'
import SocialMenu from './components/header/social-menu'
import Logo from './components/header/logo'
import MainMenu from './components/header/main-menu'
import Footer from './components/footer'
import Copyright from './components/footer/copyright'
import FooterMenu from './components/footer/footer-menu'

const App = () => {
  return (
    <>
      <Header>
        <Logo/>
        <SocialMenu/>
        <MainMenu/>
      </Header>


      <Footer>
        <Copyright/>
        <FooterMenu/>
      </Footer>
    
    </>
  )
}

export default App