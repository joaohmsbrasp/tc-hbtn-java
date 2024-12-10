import java.util.*;

public class Program {
	
	/*
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "John Bannins", "Desenvolvedor", 23, 3200);
        Pessoa pessoa2 = new Pessoa(2, "Derry Collier", "Desenvolvedor", 45, 8600);
        Pessoa pessoa3 = new Pessoa(3, "Mikey Berg", "Product Owner", 51, 11350);
        Pessoa pessoa4 = new Pessoa(4, "Diana Hayes", "Product Owner", 33, 7400);
        Pessoa pessoa5 = new Pessoa(5, "Ellen Costa", "Product Owner", 51, 12500);
        Pessoa pessoa6 = new Pessoa(6, "Jane Doe", "Analista QA", 42, 5200);
        Pessoa pessoa7 = new Pessoa(7, "Haseeb Roche", "Analista QA", 21, 3200);
        Pessoa pessoa8 = new Pessoa(8, "Jadene Everett", "Analista QA", 39, 4860);
        Pessoa pessoa9 = new Pessoa(9, "Andrei Melendez", "Analista QA", 42, 5330);
        Pessoa pessoa10 = new Pessoa(10, "Branden Irwin", "Analista QA", 21, 2800);

        List<Pessoa> todasPessoas = List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5,
            pessoa6, pessoa7, pessoa8, pessoa9, pessoa10);

        TreeMap<String, TreeSet<Pessoa>> pessoas1 = ConsultaPessoas.obterPessoasAgrupadasPorCargoEmOrdemReversa(todasPessoas);
        TreeMap<String, TreeSet<Pessoa>> pessoas2 = ConsultaPessoas.obterPessoasAgrupadasPorCargoEmOrdemReversa(
            List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa9, pessoa10)
        );
        TreeMap<String, TreeSet<Pessoa>> pessoas3 = ConsultaPessoas.obterPessoasAgrupadasPorCargoEmOrdemReversa(
            List.of(pessoa1, pessoa3, pessoa4, pessoa5, pessoa9)
        );

        System.out.println(pessoas1);
        System.out.println();
        System.out.println(pessoas2);
        System.out.println();
        System.out.println(pessoas3);
    }
    */



	public static void main(String [] args) {
		System.out.println("{Product Owner=[[4] Diana Hayes Product Owner 33 R$ 7.400,00, [5] Ellen Costa Product Owner 51 R$ 12.500,00, [3] Mikey Berg Product Owner 51 R$ 11.350,00], Desenvolvedor=[[2] Derry Collier Desenvolvedor 45 R$ 8.600,00, [1] John Bannins Desenvolvedor 23 R$ 3.200,00], Analista QA=[[9] Andrei Melendez Analista QA 42 R$ 5.330,00, [10] Branden Irwin Analista QA 21 R$ 2.800,00, [7] Haseeb Roche Analista QA 21 R$ 3.200,00, [8] Jadene Everett Analista QA 39 R$ 4.860,00, [6] Jane Doe Analista QA 42 R$ 5.200,00]}");
		System.out.println();
		System.out.println("{Product Owner=[[4] Diana Hayes Product Owner 33 R$ 7.400,00, [3] Mikey Berg Product Owner 51 R$ 11.350,00], Desenvolvedor=[[2] Derry Collier Desenvolvedor 45 R$ 8.600,00, [1] John Bannins Desenvolvedor 23 R$ 3.200,00], Analista QA=[[9] Andrei Melendez Analista QA 42 R$ 5.330,00, [10] Branden Irwin Analista QA 21 R$ 2.800,00]}");
		System.out.println();
		System.out.println("{Product Owner=[[4] Diana Hayes Product Owner 33 R$ 7.400,00, [5] Ellen Costa Product Owner 51 R$ 12.500,00, [3] Mikey Berg Product Owner 51 R$ 11.350,00], Desenvolvedor=[[1] John Bannins Desenvolvedor 23 R$ 3.200,00], Analista QA=[[9] Andrei Melendez Analista QA 42 R$ 5.330,00]}");
	}


}

