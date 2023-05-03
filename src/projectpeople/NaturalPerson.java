package src.projectpeople;

public class NaturalPerson extends People {

    public String cpf;

    public String validatorCpf(String cnpj){
        if (cnpj.length() != 14){
            return  "CPF invalid";
        }else {
            return  "CPF valid";
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
