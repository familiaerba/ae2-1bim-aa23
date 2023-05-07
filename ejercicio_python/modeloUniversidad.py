from modeloCarrera import Carrera

class Universidad:
    carreras  = []
    def __init__(self, nom, siglas, direc, numProf):
        self.nombre = nom
        self.siglas = siglas
        self.direccion = direc
        self.numProfesores = numProf

    def imprimirInformacion(self):
        print (self.nombre,"\n",self.siglas,"\n",self.direccion,"\n", self.numProfesores )

    def agregarCarreras(self):
        contador = 1
        while(contador <=2):
            nombreC = input("Escriba el nombre de la carrera: ")
            modalidadC = input("Escriba modalidad: ")
            numSemestresC = input("Ingrese el numero de semestres: ")
            numProfesoresC = input("Ingrese el numero de profesores: ")
            c = Carrera (nombreC, modalidadC, numSemestresC, numProfesoresC)
            self.carreras.append(c)
            contador = contador +1

    def listadoCarreras(self):
        return self.carreras
