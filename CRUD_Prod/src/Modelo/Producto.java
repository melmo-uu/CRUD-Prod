package Modelo;


public class Producto {
        public String nomProducto;
        public String descProducto;
        public int precProducto;
        public int stockProducto;
        public String catProducto;

    public Producto(String nomProducto, String descProducto, int precProducto, int stockProducto, String catProducto) {
        this.nomProducto = nomProducto;
        this.descProducto = descProducto;
        this.precProducto = precProducto;
        this.stockProducto = stockProducto;
        this.catProducto = catProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public int getPrecProducto() {
        return precProducto;
    }

    public void setPrecProducto(int precProducto) {
        this.precProducto = precProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getCatProducto() {
        return catProducto;
    }

    public void setCatProducto(String catProducto) {
        this.catProducto = catProducto;
    }
        
        
}
