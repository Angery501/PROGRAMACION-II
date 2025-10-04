class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} el animal camina")


class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} el león corre salvajemente")


class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} el pingüino nada rápidamente")


class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} el canguro salta con sus patas poderosas")


# Crear instancia de cada animal
animales = [

    Leon("Simba", 3),
    Pinguino("Penny", 2),
    Canguro("Skippy", 1)
]

# Hacer que cada animal se desplace
print("Demostración de movimientos:")
for animal in animales:
    animal.desplazarse()