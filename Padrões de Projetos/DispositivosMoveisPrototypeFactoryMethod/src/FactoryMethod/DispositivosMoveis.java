package FactoryMethod;

public abstract class DispositivosMoveis {
    private double tamanhoTela,cameraTraseira, preco;
    private double cameraFrontal=0;
    private int memoria, armazenamento;
    private String nomeModelo, tipoMemoria, marca, sistemaOperacional;

    public void exibirInfo(){
        System.out.print("Marca: "+getMarca()+"\nNome/Modelo: "+getNomeModelo()+
        "\nS.O: "+getSistemaOperacional()+"\nMemoria: "+getMemoria()+getTipoMemoria()+
        "\nArmazenamento: "+getArmazenamento()+"GB\nTela: "+getTamanhoTela()+"\"\nCamera: "
        +getCameraTraseira()+"MP");
        if(getCameraFrontal()!=0)
            System.out.print("/"+getCameraFrontal()+"MP(frontal)\n");
        System.out.println("Preco: R$"+getPreco()+"\n");
    }
    public double getTamanhoTela() {
        return tamanhoTela;
    }
    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
    public double getCameraTraseira() {
        return cameraTraseira;
    }
    public void setCameraTraseira(double cameraTraseira) {
        this.cameraTraseira = cameraTraseira;
    }
    public double getCameraFrontal() {
        return cameraFrontal;
    }
    public void setCameraFrontal(double cameraFrontal) {
        this.cameraFrontal = cameraFrontal;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public int getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String getNomeModelo() {
        return nomeModelo;
    }
    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }
    public String getTipoMemoria() {
        return tipoMemoria;
    }
    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}