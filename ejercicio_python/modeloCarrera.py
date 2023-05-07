class Carrera:
    def __init__(self, nombre, modalidad, numSemestres, numProfesores):
        self.nombre = nombre
        self.modalidad = modalidad
        self.numSemestres = numSemestres
        self.numProfesores = numProfesores

    def imprimirInformacion(self):
        print (self.nombre,"\n",self.modalidad,"\n",self.numSemestres,"\n", self.numProfesores )
