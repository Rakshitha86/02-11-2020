class RoadTaxCalculator{
public static void main(String args[]){
int vehiclePrice=200000;
String stateKeyword="KA";
switch(stateKeyword){
case"KA":
float roadTaxOfKA=vehiclePrice*0.10f;
System.out.println(roadTaxOfKA);
break;
case"AP":
float roadTaxOfAP=vehiclePrice*0.20f;
System.out.println(roadTaxOfAP);
break;
case"UP":
float roadTaxOfUP=vehiclePrice*0.30f;
System.out.println(roadTaxOfUP);
break;
case"TN":
float roadTaxOfTN=vehiclePrice*0.40f;
System.out.println(roadTaxOfTN);
break;
case"MH":
float roadTaxOfMH=vehiclePrice*0.50f;
System.out.println(roadTaxOfMH);
break;
case"OD":
float roadTaxOfOD=vehiclePrice*0.60f;
System.out.println(roadTaxOfOD);
break;
default:System.out.println("Choose  KA,AP,UP,TN,MH or OD");
}
}
}
