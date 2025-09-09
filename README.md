# SauceDemo Automation Framework

Este proyecto implementa un framework de automatización de pruebas para la aplicación web [SauceDemo](https://www.saucedemo.com/) utilizando **Selenium WebDriver**, **Java**, **TestNG** y el patrón **Page Object Model (POM)** con **PageFactory**.

---

## Escenarios Automatizados

1. **Purchase a Product**
    - Selecciona un producto aleatorio.
    - Lo agrega al carrito.
    - Completa el flujo de checkout.
    - Valida que se muestre el mensaje: *"Thank you for your order!"*.

2. **Removing elements of the Shopping Cart**
    - Agrega 3 productos diferentes al carrito.
    - Ingresa al carrito.
    - Los elimina.
    - Valida que el carrito esté vacío.

3. **Logout**
    - Realiza login en la aplicación.
    - Usa el menú lateral para cerrar sesión.
    - Valida que el usuario sea redirigido correctamente a la página de login.
