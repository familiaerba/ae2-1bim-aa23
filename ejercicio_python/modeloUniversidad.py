class Universidad:
    def __init__(self, nom, siglas, direc, numProf):
        self.nombre = nom
        self.siglas = siglas
        self.direccion = direc
        self.numProfesores = numProf

    def imprimirInformacion(self):
        print (self.nombre,"\n",self.siglas,"\n",self.direccion,"\n", self.numProfesores )
