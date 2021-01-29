# civico-spree-android
Modulo API Spree

Para usar la librería se debe generar el archivo .aar (por medio del gradle). Luego se debe incluir este archivo como un nuevo módulo dentro de la aplicación android donde necesitemos la librería (New - Module - Import .JAR/ .AAR Package) . Por último agregamos: implementation project(":spreelibrary-release") al gradle del proyecto. 

Hecho esto, ya podemos hacer uso de la librería, en el package service hay unas clases singleton que están listas para devolver la información que necesitamos, por ejemplo:

Si queremos obtener todo el objeto de la orden dado su número y el token del usuario, entonces sería:

En Kotlin:

        OrderServices.getOrder("R118199495", "XD8oN79QOa5pdo9QnYzDww1603224099434", object : DataCallback<Order>{
            override fun onResponse(data: Order) {
                println(data)
            }

            override fun onError(code: Int, message: String) {
                println(code)
                println(message)
            }
        })
               
En Java:

        OrderServices.INSTANCE.getOrder("R118199495", "XD8oN79QOa5pdo9QnYzDww1603224099434", new DataCallback<Order>() {
            @Override
            public void onResponse(Order order) {
                
            }

            @Override
            public void onError(int i, @NotNull String s) {

            }
        });


Cada función requiere de unos parámetros dados por el servicio del backend (https://guides.spreecommerce.org/api/summary.html)
