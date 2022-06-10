package br.edu.ifpr;
import br.edu.ifprPo.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class aplicativoCod extends JFrame implements ActionListener {
	//variaveis globais
		private JLabel campo1, campo2, campo3, campo4, campo5, campo6, campo7;
	    private JTextField nome, idade, cidade, email;
	    private JRadioButton masculino, feminino;
	    private ButtonGroup sexo;
	    private JTextArea texto;
	    private JButton botao1, botao2;
	    private String[] estados = { "", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "SC", "SE", "SP", "TO"};
	    private String Hobbie, genero;
	    private JComboBox<String> Estado;
	    private JCheckBox assistir, ler, musica, caminhar;
	   
	    public aplicativoCod() {
	    	//criacao janela
	    	this.setTitle("Dados cadastrais");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.construirLayout(this.getContentPane());
			
			this.setSize(500,400);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
			
	    }			
			private void construirLayout(Container panel) {
			//criacao layout, label, text field, botões
			panel.setLayout(new FlowLayout());
	        campo1 = new JLabel("Nome Completo:");
	        campo2 = new JLabel("Idade:");
	        campo3 = new JLabel("Sexo:");
	        campo4 = new JLabel("Cidade:");
	        campo5 = new JLabel("Estado:");
	        campo6 = new JLabel("Email:");
	        campo7 = new JLabel("Hobbies favoritos:");
	         
	        nome = new JTextField(30);
	        idade = new JTextField(3);
	        cidade = new JTextField(20);
	        email = new JTextField(20);
	        	        
	        masculino = new JRadioButton("Masculino");
	        feminino = new JRadioButton("Feminino");
	        sexo = new ButtonGroup();
	        sexo.add(masculino);
	        sexo.add(feminino);
	        
	        Estado = new JComboBox<>(estados);
	        
	        assistir = new JCheckBox  ("Assistir TV");
			ler = new JCheckBox ("Ler");
			musica = new JCheckBox ("Escutar música");
			caminhar = new JCheckBox ("Caminhar");
			
	        texto = new JTextArea(10,30);
	        JScrollPane rolagem = new JScrollPane(texto);
	        
	        botao1 = new JButton("Cadastrar");
	        botao2 = new JButton("Limpar");
	        
	        JPanel pnBotoes = new JPanel();
			pnBotoes.add(botao1);
			pnBotoes.add(botao2);
			
	        botao1.addActionListener(this);
	        botao2.addActionListener(this);
	        
	        panel.add(campo1);
	        panel.add(nome);
	        panel.add(campo2);
	        panel.add(idade);
	        panel.add(campo3);
	        panel.add(masculino);
	        panel.add(feminino);
	        panel.add(campo4);
	        panel.add(cidade);
	        panel.add(campo5);
	        panel.add(Estado);
	        panel.add(campo6);
	        panel.add(email);
	        panel.add(campo7);
	        panel.add(caminhar);
	        panel.add(assistir);
	        panel.add(ler);
	        panel.add(musica);
	        panel.add(rolagem, BorderLayout.CENTER);
	        panel.add(pnBotoes, BorderLayout.PAGE_END);
	                
	        }
			//ações de clique
			public void actionPerformed(ActionEvent e) {
			Object[] botao = {"Sim", "Não"};
	        if(e.getSource()==botao1) {
	        int opcao = JOptionPane.showOptionDialog(null, "Deseja salvar os dados?(Dados obrigatórios: Nome, Idade, Cidade e Estado)", "Confirmar ação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, botao, botao[0]);
	        if(opcao == JOptionPane.YES_OPTION) {
	        	String valor1= nome.getText();
				String valor2= idade.getText();
				String valor3= cidade.getText();
				String valor4 = (String)Estado.getSelectedItem();
		        if(valor1.isEmpty() || valor1.isBlank()) { //&& valor3.isEmpty() && valor4.isBlank()){
					JOptionPane.showMessageDialog(null, "Nome Completo deve estar preenchido", "Erro", JOptionPane.ERROR_MESSAGE);
				}else if(valor2.isEmpty() || valor2.isBlank()) { //&& valor3.isEmpty() && valor4.isBlank()){
					JOptionPane.showMessageDialog(null, "Idade deve estar preenchido", "Erro", JOptionPane.ERROR_MESSAGE);
				}else if(valor3.isEmpty() || valor3.isBlank()) { //&& valor3.isEmpty() && valor4.isBlank()){
					JOptionPane.showMessageDialog(null, "Cidade deve estar preenchido", "Erro", JOptionPane.ERROR_MESSAGE);
				}else if(valor4.isEmpty() || valor4.isBlank()) { //&& valor3.isEmpty() && valor4.isBlank()){
					JOptionPane.showMessageDialog(null, "Estado deve ser selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
				}else {
				JOptionPane.showMessageDialog(null, "Dados salvos com sucesso", "Dados cadastrais", JOptionPane.INFORMATION_MESSAGE);
				String mensagem = "";

	            mensagem += "Nome: " + nome.getText() + "\n";
	            mensagem += "Idade: " + idade.getText() + "\n";
	            mensagem += "Sexo: " + sexualidade() + "\n";
	            mensagem += "Cidade: " + cidade.getText() + "\n";
	            mensagem += "Estado: " + Estado.getSelectedItem() + "\n";
	            mensagem += "Email: " + email.getText() + "\n";
	            mensagem += "Hobbies\nCaminhar: " + hobbie1()+"\n" + 
	            "Assistir TV: " + hobbie2()+"\n" + "Ler: " + hobbie3()+"\n" + 
	            		"Escutar música: " + hobbie4()+"\n";
	            mensagem += "\n------------------------------\n";
	            
	            
	            texto.append(mensagem);
	            
	            Pessoa pessoa = new Pessoa(nome.getText(), 
						Integer.parseInt(idade.getText()),
						sexualidade(), cidade.getText(),
						(String)Estado.getSelectedItem(),
						email.getText(), hobbie1(), hobbie2(), hobbie3(), hobbie4());
	            
	            /*Pessoa pessoa2 = new Pessoa(nome.getText(), 
						Integer.parseInt(idade.getText()),
						sexualidade(), cidade.getText(),
						(String)Estado.getSelectedItem(),
						email.getText(), hobbie1(), hobbie2(), hobbie3(), hobbie4());*/
	            
	            //System.out.println(pessoa.toString()); //teste para ver se ficou registrado na classe
	            //System.out.println(pessoa2.toString());
				}
	        }
	        }
	        
	        if(e.getSource()==botao2) {
	        	int opcao = JOptionPane.showOptionDialog(null, "Deseja limpar o formulário?", "Confirmar ação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botao, botao[0]);
	        if (opcao == JOptionPane.YES_OPTION ) {
	        	nome.setText("");
	            idade.setText("");        
	            cidade.setText("");
	            email.setText("");
	            sexo.clearSelection();
	            Estado.setSelectedIndex(0);
	            assistir.setSelected(false);
	            ler.setSelected(false);
	            caminhar.setSelected(false);
	            musica.setSelected(false);
	        }
	        }
	    }
			//metodo para "converter" checkbox em string
	    public String hobbie1() {
	    	//String hobbie1, hobbie2, hobbie3, hobbie4;
	    	if(caminhar.isSelected()) {
	    		Hobbie = "Sim";
	    	}else {
	    		Hobbie = "Não";
	    	}
	    	return Hobbie;
	    }
	    public String hobbie2() {
	    	if(assistir.isSelected()) {
	    		Hobbie = "Sim";
	    	}else {
	    		Hobbie = "Não";
	    	}
	    	return Hobbie;
	    }
	    public String hobbie3() {
	    	if(ler.isSelected()) {
	    		Hobbie = "Sim";
	    	}else {
	    		Hobbie = "Não";
	    	}
	    	return Hobbie;
	    }
	    public String hobbie4() {
	    	if(musica.isSelected()) {
	    		Hobbie = "Sim";
	    	}else {
	    		Hobbie = "Não";
	    	}
	    	return Hobbie;
	    }
	    
	    public String sexualidade() {
	    	
	    	if (masculino.isSelected()) {
	    		genero = masculino.getText();
	    	}else if (feminino.isSelected()) {
	    		genero = feminino.getText();	    	
	    	}
			return genero;
	    }
}    

