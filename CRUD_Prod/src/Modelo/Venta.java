package Modelo;

    
public class Venta {
        public String prodVendido;
        public String nomCliente;

    public Venta(String prodVendido, String nomCliente) {
        this.prodVendido = prodVendido;
        this.nomCliente = nomCliente;
    }

    public String getProdVendido() {
        return prodVendido;
    }

    public void setProdVendido(String prodVendido) {
        this.prodVendido = prodVendido;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
        
        
}
