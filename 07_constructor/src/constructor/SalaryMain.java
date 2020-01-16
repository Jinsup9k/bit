package constructor;

import java.text.DecimalFormat;

public class SalaryMain {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###");
		// 입력
		SalaryDTO ar[] = {new SalaryDTO("홍길동", "부장", 5000000, 200000)
						 ,new SalaryDTO("유재석", "과장", 3500000, 150000)
						 ,new SalaryDTO("박진수", "사원", 1800000, 100000)};
		
		System.out.println("이름\t직급\t기본급\t\t수당\t세율\t세금\t월급");
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
