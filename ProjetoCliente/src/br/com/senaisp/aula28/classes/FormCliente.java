package br.com.senaisp.aula28.classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCliente extends JFrame {

	private JPanel contentPane;
	private JTable tblClientes;
	private DefaultTableModel tblMdCli;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente frame = new FormCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCliente() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pnlBotoes = new JPanel();
		contentPane.add(pnlBotoes, BorderLayout.SOUTH);

		JButton btnAdicinar = new JButton("Adicionar");
		pnlBotoes.add(btnAdicinar);

		JButton btnConsultar = new JButton("Consultar");
		pnlBotoes.add(btnConsultar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormClienteManutencao fmtCli = new FormClienteManutencao();
				fmtCli.setTblMdCli(tblMdCli);
				fmtCli.setLinhaSelecionada(tblClientes.getSelectedRow());
				fmtCli.setTipoOperacao(3);
				fmtCli.setVisible(true);
			}
		});
		pnlBotoes.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		pnlBotoes.add(btnExcluir);

		JScrollPane scrClientes = new JScrollPane();
		contentPane.add(scrClientes, BorderLayout.CENTER);

		String titulos[] = { "Código", "Nome", "Telefone", "Dt. Nascimento" };

		tblMdCli = new DefaultTableModel(titulos, 0) {

			@Override
			public boolean isCellEditable(int row, int column) {

				return false;
			}

		};

		tblClientes = new JTable(tblMdCli) {
			@Override
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				Component cmp = super.prepareRenderer(renderer, row, column);
				if (!isCellSelected(row, column)) {
					cmp.setBackground(row % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);

				}
				// Alinhando a coluna do código
				if (column == 0) {
					((JLabel) cmp).setHorizontalAlignment(SwingConstants.RIGHT);
				} else {
					((JLabel) cmp).setHorizontalAlignment(SwingConstants.LEFT);
				}
				// Colocando o espaçamento entre a borda da celula e o conteúdo
				((JLabel) cmp).setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
				
				return cmp;
			}
		};
		scrClientes.setViewportView(tblClientes);
		// Obtendo o objeto de calendário para utilizar as datas
		Calendar cal = Calendar.getInstance();
		// Obtendo o objeto formatador de datas
		DateFormat fmtDt = new SimpleDateFormat("dd/mm/yyyy");
		for (int lin = 1; lin <= 5; lin++) {
			// Colocando a data para dia (variando de 1 a 5 ), mês 1 ano 1980
			cal.set(1980, 1, lin);
			Date dtNasc = cal.getTime();

			Object item[] = { lin, "Cliente" + lin, "14 9999-8833", fmtDt.format(dtNasc) };
			// Adicionando o item á linha conjunto de dados
			tblMdCli.addRow(item);
		}
	}
}
