package src.projectpeople;

public class LegalPerson extends People {

    public String cnpj;

    public String validatorCnpj(String cnpj){
        if (cnpj.length() != 14){
            return  "::::::::CNPJ invalid::::::::";
        }else {
            return  "::::::::CNPJ valid::::::::";
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
