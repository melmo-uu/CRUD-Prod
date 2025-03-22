
package Modelo;


public class Proveedor {
    public String nomProveedor;
    public String dirProveedor;
    public int numProveedor;

    public Proveedor(String nomProveedor, String dirProveedor, int numProveedor) {
        this.nomProveedor = nomProveedor;
        this.dirProveedor = dirProveedor;
        this.numProveedor = numProveedor;
    }

    public String getNomProveedor() {
        return nomProveedor;
    }

    public void setNomProveedor(String nomProveedor) {
        this.nomProveedor = nomProveedor;
    }

    public String getDirProveedor() {
        return dirProveedor;
    }

    public void setDirProveedor(String dirProveedor) {
        this.dirProveedor = dirProveedor;
    }

    public int getNumProveedor() {
        return numProveedor;
    }

    public void setNumProveedor(int numProveedor) {
        this.numProveedor = numProveedor;
    }
    
    
}
