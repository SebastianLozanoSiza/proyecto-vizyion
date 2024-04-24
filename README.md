![](https://raw.githubusercontent.com/CampusLands/DER/main/DER.jpg)

**1. Listar todas las ventas que se realizaron en el mes de julio de 2023**

```sql
[
  {
    "id": 1,
    "fecha": "2023-07-20T05:00:00.000+00:00",
    "nombreEmpleado": "Juan Pérez",
    "nombreCliente": "Juan Pérez",
    "formaPago": "Efectivo"
  }
]
```

**2. Seleccionar todos los empleados con sus respectivos cargos y municipios**

```sql
[
  {
    "id": 1,
    "nombre": "Juan Pérez",
    "nombreCargo": "Vendedor",
    "fechaIngreso": "2023-07-20T05:00:00.000+00:00",
    "municipio": "Medellín"
  },
  {
    "id": 2,
    "nombre": "María López",
    "nombreCargo": "Administrador",
    "fechaIngreso": "2023-08-03T05:00:00.000+00:00",
    "municipio": "Bogotá, D.C."
  },
  {
    "id": 3,
    "nombre": "Sofía García",
    "nombreCargo": "Diseñador",
    "fechaIngreso": "2023-08-10T05:00:00.000+00:00",
    "municipio": "Zipaquirá"
  },
  {
    "id": 4,
    "nombre": "Pedro Gómez",
    "nombreCargo": "Vendedor",
    "fechaIngreso": "2023-08-17T05:00:00.000+00:00",
    "municipio": "Cali"
  },
  {
    "id": 5,
    "nombre": "Ana Sánchez",
    "nombreCargo": "Administrador",
    "fechaIngreso": "2023-08-24T05:00:00.000+00:00",
    "municipio": "Buenos Aires"
  },
  {
    "id": 6,
    "nombre": "Carlos Hernández",
    "nombreCargo": "Diseñador",
    "fechaIngreso": "2023-08-31T05:00:00.000+00:00",
    "municipio": "Ciudad de México"
  },
  {
    "id": 7,
    "nombre": "Luisa Rodríguez",
    "nombreCargo": "Vendedor",
    "fechaIngreso": "2023-09-07T05:00:00.000+00:00",
    "municipio": "Miami"
  },
  {
    "id": 8,
    "nombre": "Daniela Castillo",
    "nombreCargo": "Administrador",
    "fechaIngreso": "2023-09-14T05:00:00.000+00:00",
    "municipio": "Londres"
  },
  {
    "id": 9,
    "nombre": "Andrés Morales",
    "nombreCargo": "Diseñador",
    "fechaIngreso": "2023-09-21T05:00:00.000+00:00",
    "municipio": "París"
  },
  {
    "id": 10,
    "nombre": "Camila Gutiérrez",
    "nombreCargo": "Vendedor",
    "fechaIngreso": "2023-09-28T05:00:00.000+00:00",
    "municipio": "Tokio"
  }
]
```

**3. Obtener la lista de todas las ventas con la información de los clientes y la forma de pago**

```sql
[
  {
    "id": 1,
    "fecha": "2023-07-20T05:00:00.000+00:00",
    "nombreCliente": "Juan Pérez",
    "clienteCedula": "123456789",
    "tipoPersona": "Cliente",
    "fechaRegistro": "2023-07-20T05:00:00.000+00:00",
    "municipio": "Medellín",
    "formaPago": "Efectivo"
  },
  {
    "id": 2,
    "fecha": "2023-08-03T05:00:00.000+00:00",
    "nombreCliente": "María López",
    "clienteCedula": "987654321",
    "tipoPersona": "Proveedor",
    "fechaRegistro": "2023-08-03T05:00:00.000+00:00",
    "municipio": "Bogotá, D.C.",
    "formaPago": "Tarjeta de crédito"
  },
  {
    "id": 3,
    "fecha": "2023-08-10T05:00:00.000+00:00",
    "nombreCliente": "Sofía García",
    "clienteCedula": "321654987",
    "tipoPersona": "Empleado",
    "fechaRegistro": "2023-08-10T05:00:00.000+00:00",
    "municipio": "Zipaquirá",
    "formaPago": "Tarjeta de débito"
  },
  {
    "id": 4,
    "fecha": "2023-08-17T05:00:00.000+00:00",
    "nombreCliente": "Pedro Gómez",
    "clienteCedula": "789456123",
    "tipoPersona": "Cliente",
    "fechaRegistro": "2023-08-17T05:00:00.000+00:00",
    "municipio": "Cali",
    "formaPago": "Efectivo"
  },
  {
    "id": 5,
    "fecha": "2023-08-24T05:00:00.000+00:00",
    "nombreCliente": "Ana Sánchez",
    "clienteCedula": "234567891",
    "tipoPersona": "Proveedor",
    "fechaRegistro": "2023-08-24T05:00:00.000+00:00",
    "municipio": "Buenos Aires",
    "formaPago": "Tarjeta de crédito"
  },
  {
    "id": 6,
    "fecha": "2023-08-31T05:00:00.000+00:00",
    "nombreCliente": "Carlos Hernández",
    "clienteCedula": "654987321",
    "tipoPersona": "Empleado",
    "fechaRegistro": "2023-08-31T05:00:00.000+00:00",
    "municipio": "Ciudad de México",
    "formaPago": "Tarjeta de débito"
  },
  {
    "id": 7,
    "fecha": "2023-09-07T05:00:00.000+00:00",
    "nombreCliente": "Luisa Rodríguez",
    "clienteCedula": "9876543210",
    "tipoPersona": "Cliente",
    "fechaRegistro": "2023-09-07T05:00:00.000+00:00",
    "municipio": "Miami",
    "formaPago": "Efectivo"
  },
  {
    "id": 8,
    "fecha": "2023-09-14T05:00:00.000+00:00",
    "nombreCliente": "Daniela Castillo",
    "clienteCedula": "1098765432",
    "tipoPersona": "Proveedor",
    "fechaRegistro": "2023-09-14T05:00:00.000+00:00",
    "municipio": "Londres",
    "formaPago": "Tarjeta de crédito"
  },
  {
    "id": 9,
    "fecha": "2023-09-21T05:00:00.000+00:00",
    "nombreCliente": "Andrés Morales",
    "clienteCedula": "3210987654",
    "tipoPersona": "Empleado",
    "fechaRegistro": "2023-09-21T05:00:00.000+00:00",
    "municipio": "París",
    "formaPago": "Tarjeta de débito"
  },
  {
    "id": 10,
    "fecha": "2023-09-28T05:00:00.000+00:00",
    "nombreCliente": "Camila Gutiérrez",
    "clienteCedula": "7654321098",
    "tipoPersona": "Cliente",
    "fechaRegistro": "2023-09-28T05:00:00.000+00:00",
    "municipio": "Tokio",
    "formaPago": "Efectivo"
  }
]
```

**4. Mostrar los detalles de todas las órdenes junto con los nombres de los empleados y clientes asociados**

```sql
[
  {
    "id": 1,
    "fecha": "2023-07-20T05:00:00.000+00:00",
    "nombreEmpleado": "Juan Pérez",
    "nombreCliente": "Juan Pérez",
    "estado": "Pendiente"
  },
  {
    "id": 2,
    "fecha": "2023-08-03T05:00:00.000+00:00",
    "nombreEmpleado": "María López",
    "nombreCliente": "María López",
    "estado": "En proceso"
  },
  {
    "id": 3,
    "fecha": "2023-08-10T05:00:00.000+00:00",
    "nombreEmpleado": "Sofía García",
    "nombreCliente": "Sofía García",
    "estado": "Listo para enviar"
  },
  {
    "id": 4,
    "fecha": "2023-08-17T05:00:00.000+00:00",
    "nombreEmpleado": "Juan Pérez",
    "nombreCliente": "Pedro Gómez",
    "estado": "Enviado"
  },
  {
    "id": 5,
    "fecha": "2023-08-24T05:00:00.000+00:00",
    "nombreEmpleado": "María López",
    "nombreCliente": "Ana Sánchez",
    "estado": "Entregado"
  }
]
```

**5. Listar los productos disponibles en el inventario junto con su talla y color**

```sql
[
  {
    "id": 1,
    "codigo": "INV001",
    "nombrePrenda": "Camiseta de algodón manga corta",
    "color": "Negro",
    "valorVta": 25000,
    "valorVtaUsd": 6.25,
    "talla": [
      {
        "talla": "XS - Extra pequeña"
      }
    ]
  },
  {
    "id": 2,
    "codigo": "INV002",
    "nombrePrenda": "Camisa de manga larga",
    "color": "Blanco",
    "valorVta": 37500,
    "valorVtaUsd": 9.375,
    "talla": [
      {
        "talla": "S - Pequeña"
      }
    ]
  },
  {
    "id": 3,
    "codigo": "INV003",
    "nombrePrenda": "Pantalón de mezclilla",
    "color": "Rojo",
    "valorVta": 50000,
    "valorVtaUsd": 12.5,
    "talla": [
      {
        "talla": "M - Mediana"
      }
    ]
  },
  {
    "id": 4,
    "codigo": "INV004",
    "nombrePrenda": "Vestido de algodón",
    "color": "Verde",
    "valorVta": 62500,
    "valorVtaUsd": 15.625,
    "talla": [
      {
        "talla": "L - Grande"
      }
    ]
  },
  {
    "id": 5,
    "codigo": "INV005",
    "nombrePrenda": "Zapatos casuales",
    "color": "Azul",
    "valorVta": 75000,
    "valorVtaUsd": 18.75,
    "talla": [
      {
        "talla": "XL - Extra grande"
      }
    ]
  },
  {
    "id": 6,
    "codigo": "INV006",
    "nombrePrenda": "Gafas de sol",
    "color": null,
    "valorVta": 12500,
    "valorVtaUsd": 3.125,
    "talla": []
  },
  {
    "id": 7,
    "codigo": "INV007",
    "nombrePrenda": "Chaqueta de cuero",
    "color": null,
    "valorVta": 187500,
    "valorVtaUsd": 46.875,
    "talla": []
  },
  {
    "id": 8,
    "codigo": "INV008",
    "nombrePrenda": "Traje de baño",
    "color": null,
    "valorVta": 62500,
    "valorVtaUsd": 15.625,
    "talla": []
  },
  {
    "id": 9,
    "codigo": "INV009",
    "nombrePrenda": "Gorra",
    "color": null,
    "valorVta": 12500,
    "valorVtaUsd": 3.125,
    "talla": []
  },
  {
    "id": 10,
    "codigo": "INV010",
    "nombrePrenda": "Medias",
    "color": null,
    "valorVta": 5000,
    "valorVtaUsd": 1.25,
    "talla": []
  }
]
```

**6. Mostrar todos los proveedores junto con la lista de insumos que suministra**

```sql
[
  {
    "id": 1,
    "nit": "900000000-1",
    "nombre": "Proveedor 1",
    "tipoPersona": "Cliente",
    "municipio": "Medellín",
    "listaInsumos": [
      {
        "nombreInsumo": "Tela de algodón",
        "valorUnitario": 10000,
        "stockMin": 100,
        "stockMax": 1000
      }
    ]
  },
  {
    "id": 2,
    "nit": "900000000-2",
    "nombre": "Proveedor 2",
    "tipoPersona": "Proveedor",
    "municipio": "Bogotá, D.C.",
    "listaInsumos": [
      {
        "nombreInsumo": "Tela de poliéster",
        "valorUnitario": 20000,
        "stockMin": 50,
        "stockMax": 500
      }
    ]
  },
  {
    "id": 3,
    "nit": "900000000-3",
    "nombre": "Proveedor 3",
    "tipoPersona": "Empleado",
    "municipio": "Zipaquirá",
    "listaInsumos": [
      {
        "nombreInsumo": "Hilo",
        "valorUnitario": 5000,
        "stockMin": 20,
        "stockMax": 200
      }
    ]
  },
  {
    "id": 4,
    "nit": "900000000-4",
    "nombre": "Proveedor 4",
    "tipoPersona": "Cliente",
    "municipio": "Cali",
    "listaInsumos": [
      {
        "nombreInsumo": "Botones",
        "valorUnitario": 2000,
        "stockMin": 10,
        "stockMax": 100
      }
    ]
  },
  {
    "id": 5,
    "nit": "900000000-5",
    "nombre": "Proveedor 5",
    "tipoPersona": "Proveedor",
    "municipio": "Buenos Aires",
    "listaInsumos": [
      {
        "nombreInsumo": "Cierres",
        "valorUnitario": 3000,
        "stockMin": 5,
        "stockMax": 50
      }
    ]
  }
]
```

**7. Encontrar la cantidad de ventas realizadas por cada empleado**

```sql
[
  {
    "id": 1,
    "fecha": "2023-07-20T05:00:00.000+00:00",
    "nombreEmpleado": "Juan Pérez",
    "nombreCliente": "Juan Pérez",
    "formaPago": "Efectivo"
  },
  {
    "id": 4,
    "fecha": "2023-08-17T05:00:00.000+00:00",
    "nombreEmpleado": "Juan Pérez",
    "nombreCliente": "Pedro Gómez",
    "formaPago": "Efectivo"
  },
  {
    "id": 7,
    "fecha": "2023-09-07T05:00:00.000+00:00",
    "nombreEmpleado": "Juan Pérez",
    "nombreCliente": "Luisa Rodríguez",
    "formaPago": "Efectivo"
  },
  {
    "id": 10,
    "fecha": "2023-09-28T05:00:00.000+00:00",
    "nombreEmpleado": "Juan Pérez",
    "nombreCliente": "Camila Gutiérrez",
    "formaPago": "Efectivo"
  }
]
```

**8. Mostrar la lista de órdenes en proceso junto con los nombres de los clientes y empleados asociados**

```sql
[
  {
    "id": 2,
    "fecha": "2023-08-03T05:00:00.000+00:00",
    "nombreEmpleado": "María López",
    "nombreCliente": "María López",
    "estado": "En proceso"
  }
]
```

**9. Obtener el nombre de la empresa y su respectivo representante legal junto con el nombre del municipio al que pertenecen**

```sql
[
  {
    "id": 1,
    "nit": "900000000-1",
    "razonSocial": "Empresa de Ropa S.A.S.",
    "representante": "Juan Pérez",
    "municipio": "Medellín"
  },
  {
    "id": 2,
    "nit": "900000000-2",
    "razonSocial": "Empresa de Calzado S.A.S.",
    "representante": "María Rodríguez",
    "municipio": "Bogotá, D.C."
  },
  {
    "id": 3,
    "nit": "900000000-3",
    "razonSocial": "Empresa de Accesorios S.A.S.",
    "representante": "Pedro Gómez",
    "municipio": "Zipaquirá"
  },
  {
    "id": 4,
    "nit": "900000000-4",
    "razonSocial": "Empresa de Textiles S.A.S.",
    "representante": "Ana García",
    "municipio": "Cali"
  },
  {
    "id": 5,
    "nit": "900000000-5",
    "razonSocial": "Empresa de Confección S.A.S.",
    "representante": "Carlos Hernández",
    "municipio": "Buenos Aires"
  }
]
```

**10. Mostrar la lista de prendas y su respectivo stock disponible**

```sql
[
  {
    "id": 1,
    "nombre": "Camiseta de algodón manga corta",
    "valorUnit": 20000,
    "valorUnitUsd": 5,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el sol",
    "genero": "Masculino",
    "codigo": "PR001",
    "listaStock": [
      {
        "nombre": "Tela de algodón",
        "valorUnitario": 10000,
        "stockMin": 100,
        "stockMax": 1000,
        "cantidad": 2
      }
    ]
  },
  {
    "id": 2,
    "nombre": "Camisa de manga larga",
    "valorUnit": 30000,
    "valorUnitUsd": 7.5,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el sol",
    "genero": "Masculino",
    "codigo": "PR002",
    "listaStock": [
      {
        "nombre": "Tela de poliéster",
        "valorUnitario": 20000,
        "stockMin": 50,
        "stockMax": 500,
        "cantidad": 1
      }
    ]
  },
  {
    "id": 3,
    "nombre": "Pantalón de mezclilla",
    "valorUnit": 40000,
    "valorUnitUsd": 10,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el sol",
    "genero": "Masculino",
    "codigo": "PR003",
    "listaStock": [
      {
        "nombre": "Hilo",
        "valorUnitario": 5000,
        "stockMin": 20,
        "stockMax": 200,
        "cantidad": 3
      }
    ]
  },
  {
    "id": 4,
    "nombre": "Vestido de algodón",
    "valorUnit": 50000,
    "valorUnitUsd": 12.5,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el agua",
    "genero": "Masculino",
    "codigo": "PR004",
    "listaStock": [
      {
        "nombre": "Botones",
        "valorUnitario": 2000,
        "stockMin": 10,
        "stockMax": 100,
        "cantidad": 2
      }
    ]
  },
  {
    "id": 5,
    "nombre": "Zapatos casuales",
    "valorUnit": 60000,
    "valorUnitUsd": 15,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el sol",
    "genero": "Masculino",
    "codigo": "PR005",
    "listaStock": [
      {
        "nombre": "Cierres",
        "valorUnitario": 3000,
        "stockMin": 5,
        "stockMax": 50,
        "cantidad": 1
      }
    ]
  },
  {
    "id": 6,
    "nombre": "Gafas de sol",
    "valorUnit": 10000,
    "valorUnitUsd": 2.5,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el sol",
    "genero": "Masculino",
    "codigo": "PR006",
    "listaStock": [
      {
        "nombre": "Tela de algodón",
        "valorUnitario": 10000,
        "stockMin": 100,
        "stockMax": 1000,
        "cantidad": 10
      }
    ]
  },
  {
    "id": 7,
    "nombre": "Chaqueta de cuero",
    "valorUnit": 150000,
    "valorUnitUsd": 37.5,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el sol",
    "genero": "Masculino",
    "codigo": "PR007",
    "listaStock": [
      {
        "nombre": "Tela de poliéster",
        "valorUnitario": 20000,
        "stockMin": 50,
        "stockMax": 500,
        "cantidad": 5
      }
    ]
  },
  {
    "id": 8,
    "nombre": "Traje de baño",
    "valorUnit": 50000,
    "valorUnitUsd": 12.5,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el sol",
    "genero": "Masculino",
    "codigo": "PR008",
    "listaStock": [
      {
        "nombre": "Hilo",
        "valorUnitario": 5000,
        "stockMin": 20,
        "stockMax": 200,
        "cantidad": 3
      }
    ]
  },
  {
    "id": 9,
    "nombre": "Gorra",
    "valorUnit": 10000,
    "valorUnitUsd": 2.5,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el sol",
    "genero": "Masculino",
    "codigo": "PR009",
    "listaStock": [
      {
        "nombre": "Botones",
        "valorUnitario": 2000,
        "stockMin": 10,
        "stockMax": 100,
        "cantidad": 2
      }
    ]
  },
  {
    "id": 10,
    "nombre": "Medias",
    "valorUnit": 5000,
    "valorUnitUsd": 1.25,
    "estado": "Pendiente",
    "tipoProteccion": "Protección contra el sol",
    "genero": "Masculino",
    "codigo": "PR010",
    "listaStock": [
      {
        "nombre": "Cierres",
        "valorUnitario": 3000,
        "stockMin": 5,
        "stockMax": 50,
        "cantidad": 1
      }
    ]
  }
]
```

**11. Encontrar el nombre de los clientes que realizaron compras en una fecha específica junto con la cantidad de artículos comprados**

```sql
# Consulta realizada ....
```

**12. Mostrar la lista de empleados y la duración de su empleo en años **

```sql
# Consulta realizada ....
```

**13. Obtener el nombre de las prendas junto con el valor total de ventas en dólares para cada una **

```sql
# Consulta realizada ....
```

**14. Obtener el nombre de las prendas junto con la cantidad mínima y máxima de insumos necesarios para su fabricación **

```sql
# Consulta realizada ....
```

**15. Obtener la lista de empleados y su información de contacto, incluyendo el nombre, el cargo y el municipio **

```sql
# Consulta realizada ....
```

**16. Mostrar la lista de ventas realizadas en un rango de fechas específico junto con el nombre del cliente y la forma de pago **

```sql
# Consulta realizada ....
```

**17. Obtener el nombre de las prendas y su valor unitario en dólares junto con el estado de disponibilidad **

```sql
# Consulta realizada ....
```

**18. Mostrar la lista de clientes y la cantidad de compras que han realizado **

```sql
# Consulta realizada ....
```

**19. Obtener la lista de órdenes junto con el estado actual y la fecha en que se crearon **

```sql
# Consulta realizada ....
```

**20. Obtener el nombre y la descripción de los cargos con un sueldo base superior a 2.000.000  **

```sql
# Consulta realizada ....
```

**21. Mostrar la lista de clientes con sus respectivos municipios y países  **

```sql
# Consulta realizada ....
```

**22 Obtener el nombre y la descripción de los tipos de protección y el número de prendas asociadas a cada tipo  **

```sql
# Consulta realizada ....
```

**23 Mostrar la lista de empleados con sus cargos y fechas de ingreso ordenados por la fecha de ingreso de manera descendente  **

```sql
# Consulta realizada ....
```

**24 Mostrar el nombre y la descripción de todos los cargos junto con la cantidad de empleados en cada cargo  **

```sql
# Consulta realizada ....
```

**25 Obtener el nombre y la descripción de los estados junto con la cantidad de prendas asociadas a cada estado  **

```sql
# Consulta realizada ....
```

**26 Obtener el nombre y la descripción de los tipos de persona junto con la cantidad de clientes asociados a cada tipo  **

```sql
# Consulta realizada ....
```

**27 Mostrar el nombre y la descripción de los tipos de protección junto con la cantidad de prendas asociadas a cada tipo  **

```sql
# Consulta realizada ....
```

**28 Obtener el nombre y la descripción de los estados junto con la cantidad de órdenes asociadas a cada estado  **

```sql
# Consulta realizada ....
```

**29 Obtener el nombre y la descripción de los tipos de pago junto con la cantidad de ventas asociadas a cada tipo  **

```sql
# Consulta realizada ....
```

**30 Mostrar el nombre y la descripción de los tipos de insumos junto con la cantidad de prendas que los utilizan **

```sql
# Consulta realizada ....
```

**31 Obtener el nombre de los clientes y la cantidad total gastada por cada uno en ventas **

```sql
# Consulta realizada ....
```

**32 Mostrar el nombre y la descripción de las prendas junto con el valor total de ventas en pesos colombianos para cada una **

```sql
# Consulta realizada ....
```

**33 Mostrar el nombre y la descripción de los estados junto con la cantidad de prendas asociadas a cada estado en orden ascendente de la cantidad de prendas **

```sql
# Consulta realizada ....
```