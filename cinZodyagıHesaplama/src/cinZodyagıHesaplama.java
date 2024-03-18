import java.util.Scanner;

public class cinZodyagıHesaplama {

	public static void main(String[] args) {
		int dogumTarihi;
		double sonuc;
		Scanner inp= new Scanner(System.in);
		System.err.print("Doğum Yılınızı Giriniz:");
		dogumTarihi=inp.nextInt();
		sonuc=dogumTarihi%12;
		
		if (sonuc==0) {
			System.out.print("Çin Zodyağı Burcunu: Maymun");
		       }else if (sonuc==1) {
				  System.out.print("Çin Zodyağı Burcunu: Horoz");
		             }else if (sonuc==2) {
					     System.out.print("Çin Zodyağı Burcunu: Köpek");
		                     }else if (sonuc==3) {
						        System.out.print("Çin Zodyağı Burcunu: Domuz");
		                            }else if (sonuc==4) {
						            	System.out.print("Çin Zodyağı Burcunu: Fare");
		                            		}else if (sonuc==5) {
		                            			System.out.print("Çin Zodyağı Burcunu: Öküz");
		                            			}else if (sonuc==6) {
		                            				System.out.print("Çin Zodyağı Burcunu: Kaplan");
		                            				} else if (sonuc==7) {
		                            					System.out.print("Çin Zodyağı Burcunu: Tavşan");
		                            					}else if (sonuc==8) {
		                            						System.out.print("Çin Zodyağı Burcunu: Ejderha");
		                            						}else if (sonuc==9) {
		                            							System.out.print("Çin Zodyağı Burcunu: Yılan");
		                            							}else if (sonuc==10) {
		                            								System.out.print("Çin Zodyağı Burcunu: At");
		                            								}else {
		                            									System.out.print("Çin Zodyağı Burcunu: Koyun");
		                            										}
																				}
			
				
																					}


