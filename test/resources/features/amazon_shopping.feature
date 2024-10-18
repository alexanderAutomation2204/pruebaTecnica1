Feature: Amazon Shopping

  Scenario: Seleccionar dos productos para agregarlos al carro de compras
    Given que el usuario está en la página principal de Amazon
    When selecciona dos productos
    Then los productos son agregados al carrito

  Scenario: Seleccionar un producto de la opción equipos en oferta, agregarlo y eliminarlo del carro de compras
    Given que el usuario está en la página principal de Amazon
    When selecciona un producto de la opción equipos en oferta
    And lo agrega al carrito
    And luego lo elimina del carrito
    Then el carrito queda vacío
