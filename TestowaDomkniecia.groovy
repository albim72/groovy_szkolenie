class TestowaDomkniecia {
    //domknęcie statyczne anonimowe
    def static classX = {
        println("classX this: ${this}")
        println("classX owner: ${owner}")
        println("classX delegate: ${delegate}")

    }

    //domknęcie niestatyczne anonimowe (instancyjne)

    def instanceX = {
        println("instX this: ${this}")
        println("instX owner: ${owner}")
        println("instX delegate: ${delegate}")

    }

    //metoda statyczna z wywyołaniem domknięcia niestatycznego anonimowego

    def static classMethodX() {
        def classMetX = {
            println("classMX this: ${this}")
            println("classMX owner: ${owner}")
            println("classMX delegate: ${delegate}")

        }
        classMetX.call()

    }
//metoda niestatyczna z wywyołaniem domknięcia niestatycznego anonimowego
    def instanceMethodX() {
        def instanceMetX = {
            println("instMX this: ${this}")
            println("instMX owner: ${owner}")
            println("instMX delegate: ${delegate}")

        }
        instanceMetX.call()

    }


}
