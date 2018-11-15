package Team;

public class RunTeam {

	private Staff presidente;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staff presidente = new Staff("Jose", "Santos", "presidente");
		System.out.println("Nome: " + presidente.primeiro_nome);
		System.out.println("Apelido: " + presidente.apelido);
		System.out.println("Cargo: " + presidente.cargo);
		System.out.println("Salario: " + presidente.GetSalario());
		presidente.DefinirSalario(100);
		System.out.println("Novo Salario: " + presidente.GetSalario());

		
		Jogador gk = new Jogador("Ederson", "Moraes");
		Jogador defesa_1 = new Jogador("Pepe", "Lima");
		Jogador defesa_2 = new Jogador("Bruno", "Alves");
		Jogador avancado_1 = new Jogador("Cristiano", "Ronaldo");
		Jogador avancado_2 = new Jogador("Luis", "Suarez");

		System.out.println("+++++++++++++++++++++");
		
		System.out.println("Equipa");
		System.out.println("+++++++++++++++++++++");

		System.out.println("Guarda Redes");

		System.out.println("Nome: " + gk.primeiro_nome);
		System.out.println("Apelido: " + gk.apelido);
		System.out.println("Fisico: " + gk.fisico);
//		//gk.(86, 90);
		
		System.out.println("+++++++++++++++++++++");

		System.out.println("Fisico: " + gk.fisico);
		

	}

}
