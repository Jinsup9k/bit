package constructor;

import java.text.DecimalFormat;

public class SalaryMain {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###");
		// �Է�
		SalaryDTO ar[] = {new SalaryDTO("ȫ�浿", "����", 5000000, 200000)
						 ,new SalaryDTO("���缮", "����", 3500000, 150000)
						 ,new SalaryDTO("������", "���", 1800000, 100000)};
		
		System.out.println("�̸�\t����\t�⺻��\t\t����\t����\t����\t����");
		for(SalaryDTO dto : ar) {
			dto.calc();
			System.out.println(dto.getName() + 
					"\t"+dto.getPosition() + 
					"\t"+df.format(dto.getBasePay()) + 
					"\t"+df.format(dto.getBenefit()) + 
					"\t"+dto.getTaxRate() +
					"\t"+df.format(dto.getTax())+ 
					"\t"+df.format(dto.getSalary()));
	
		}
		
	}
}
