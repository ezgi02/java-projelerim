package boksMaci;

public class Match {
	fighter f1;
	fighter f2;
	int minweight;
	int maxweight;
	
	Match(fighter f1,fighter f2,int minweight,int maxweight){
		this.f1=f1;
		this.f2=f2;
		this.minweight=minweight;
		this.maxweight=maxweight;
				
	}
	void run() {
		if(isCheck()) {
			while(this.f1.health>0 && this.f1.health>0) {
				f2.health=this.f1.hit(this.f2);
				System.out.println(this.f2.health);
				
			}
			
		}
		else {
		System.out.println("sporcularin sikletleri uymuyor");	
		}
	}
	boolean isCheck() {
		return (this.f1.weight>=minweight && this.f1.weight<=maxweight) && (this.f2.weight>=minweight && this.f1.weight<=maxweight);
		
	}
}
