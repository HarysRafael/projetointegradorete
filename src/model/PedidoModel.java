package model;

public class PedidoModel {

    private int id;
    private String data;
    private String total;
    private int idCliente;
    private String bairroCliente;
    private String nomeCliente;
    private String dataCadCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataCadCliente() {
        return dataCadCliente;
    }

    public void setDataCadCliente(String dataCadCliente) {
        this.dataCadCliente = dataCadCliente;
    }

    public PedidoModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
