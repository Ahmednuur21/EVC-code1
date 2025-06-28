import java.util.Scanner;

public class EVC_codeka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 1234;
        double haraa = 1000;
        System.out.print(" Soo gali Code numberka : ");
        int code = input.nextInt();
        int userPin;

        // -----Qeybta--codeka---*770#------
        if (code == 770) {
            System.out.print(" - EVCPLUS- \n" + " Fadlan geli PIN-kaaga ( Enter  PIN ) : ");
            userPin = input.nextInt();

            if (userPin != pin) {
                System.out.println(" PIN kaagu waa Khalad ");
            } else if (userPin == pin) {
                System.out.println(" EVCPluss \n" +
                        "1. Itus Haraaga\n" +
                        "2. Kaarka Hadalka\n" +
                        "3. Bixi Biil\n" +
                        "4. U Wareeji EVCPlus\n" +
                        "5. Warbixin Kooban\n" +
                        "6. Salaam Bank\n" +
                        "7. Maareynta\n" +
                        "8. Bill Payment");

                int userOption = input.nextInt();
//                    Qeybta_1aad
                if (userOption == 1) {
                    System.out.println("<-EVCPlus-> Haraagaagu waa $ " + haraa);
                }
//                     Qeybta_2aad
                if (userOption == 2) {
                    System.out.println("Kaarka hadalka\n" +
                            "1. Ku Shubo Airtime\n" +
                            "2. Ugu shub Airtime\n" +
                            "3. MIFI Packages\n" +
                            "4. Ku shubo Internet\n" +
                            "5. Ugu shub qof kale (MMT)");
                }
                int kaarkaHadalka = input.nextInt();
//                      Qeybta_2aad_kaarka_hadalka_1aad
                if (kaarkaHadalka == 1) {
                    System.out.println(" Fadlan Geli Lcagta :");
                    int lacag = input.nextInt();
                    System.out.println("Ma hubtaa inaad $ " + lacag + "  ugu shubtid \n" +
                            "undefined?\n" +
                            "1. Haa\n" +
                            "2. Maya");
                    int undefned = input.nextInt();

                    if (undefned == 1) {
                        if (haraa < lacag)
                            System.out.println("Haraaga xisaabtaadu Kuma filna, mobile No:  252619057048 ");
                        else
                            System.out.println(" Waad ku Guuleysatay ");
                    } else {
                        System.out.println("Mahadsanid!.");
                    }
                }
//                      Qeybta_2aad_kaarka_hadalka_2aad
                else if (kaarkaHadalka == 2){
                    System.out.println("Fadlan Geli Mobile-ka");
                    int mobile = input.nextInt();
                    System.out.println("Fadlan Geli lacagta");
                    int lacagta = input.nextInt();
                    System.out.println("Ma hubtaa inaad $" + lacagta + " ugu shubtid \n" + mobile + " ?\n" +
                            "1. Haa\n" +
                            "2. Maya");
                    int hubta = input.nextInt();
                    if (hubta == 1) {
                        System.out.println("<-EVCPlus-> Waxaad $" + lacagta + " ugu shubtay\n" +
                                mobile + " Tar:13/06/2025\n" + "21:50:00 haraagagu waa $" + (haraa - lacagta));
                    }else
                        System.out.println("Mahadsanid!.");

                }

//                      Qeybta_2aad_kaarka_hadalka_3aad
                if (kaarkaHadalka == 3) {
                    System.out.println("EVCPlus\n" + "1. KU shubo Data-da MIFI");
                    int mifi = input.nextInt();

                    if (mifi == 1) {
                        System.out.println("--internet Bundle Recharge-- \n" +
                                            "1. Isbuucle(Weekly)\n" +
                                            "2. Maalinle(Daily)\n" +
                                            "3. Bille(MiFi)");
                        int internerB = input.nextInt();

                        if (internerB == 1) {
                            System.out.println("Fadlan dooro bundle ka\n" +
                                                "1. $5 = 10 GB\n" +
                                                "2. $10 = 25 GB\n");
                            int bundle = input.nextInt();

                            if (bundle == 1) {
                                System.out.println("Fadlan Gali MIFI user ");
                                int mifiUser = input.nextInt();
                                System.out.println("MIFI Waad ku guuleysatay \n" +
                                                    "in aad $5  ku shubato MIFI user " + mifiUser + "\n" +
                                                    "waxaad heshay77 10GB");
                            }
                            else if (bundle == 2) {
                                System.out.println("Fadlan Gali MIFI user ");
                                int mifiUser1 = input.nextInt();
                                System.out.println("MIFI Waad ku guuleysatay \n" +
                                                    "in aad $10  ku shubato MIFI user " + mifiUser1 + "\n" +
                                                    "waxaad heshay 25GB");
                            }
                        }

                        if (internerB == 2) {
                            System.out.println("Fadlan Gali MIFI user ");
                            int mifiUser = input.nextInt();
                            System.out.println("MIFI Waad ku guuleysatay \n" +
                                                "in aad $1 ku shubato MIFI user " + mifiUser + "\n" +
                                                "waxaad heshay 5GB");
                        }

                        if (internerB == 3) {
                            System.out.println("Fadlan Gali MIFI user ");
                            int mifiUser = input.nextInt();
                            System.out.println("MIFI Waad ku guuleysatay \n" +
                                                "in aad $20 ku shubato MIFI user " + mifiUser + "\n" +
                                                "waxaad heshay 50GB");
                        }
                    }
            //                    Qeybta_2aad_kaarka_hadalka_4aad
                }
                else if (kaarkaHadalka == 4) {
                    System.out.println(" Fadlan dooro Number-ka aad ku shubeyso \n"+
                                            "1. Isbuucle (Weekly) \n" +
                                            "2. TIME BASED PACKAGES \n" +
                                            "3. DATA \n" +
                                            "4. Maalinle(Daily) \n" +
                                            "5. Bille (MiFi)");
                    int dooro=input.nextInt();
//                    Qeybta_2aad_kaarka_hadalka+_4aad_dooro_1aad
                    if (dooro==1) {

                        System.out.println(" Fadlan Geli Lacagta ");
                        int lacag = input.nextInt();
                        System.out.println(" Ma hubtaa inaad $" + lacag + " ku shubatid?\n" +
                                            "1. Haa\n" +
                                            "2. Maya");

                        int haa_maya = input.nextInt();
                        if (haa_maya == 1) {
                            if (lacag > haraa)
                                            System.out.println("Tracnsaction amount must be less than 300");
                            else
                                            System.out.println(" Waad ku guuleysatay inaad ku shubatid lacag dhan $" + lacag + "\n" +
                                                    " waxaad heshay unlimited Isbuucle ah.");
                        }
                        else
                            System.out.println("Mahadsanid!.");
                    }
                    //     Qeybta_2aad_kaarka_hadalka_4aad_dooro_2aad
                    if (dooro==2) {
                        System.out.println(" Fadlan Geli Lacagta ");
                        int lacag = input.nextInt();
                        System.out.println(" Ma hubtaa inaad $" + lacag + " ku shubatid?\n" +
                                            "1. Haa\n" +
                                            "2. Maya");
                        int haa_maya = input.nextInt();
                        if (haa_maya == 1) {
                            if (lacag > haraa)
                                System.out.println("Tracnsaction amount must be less than 300");
                            else
                                System.out.println(" Waad ku guuleysatay inaad ku shubatid lacag dhan $" + lacag + "\n" +
                                                    " waxaad heshay unlimited TIME BASED PAKAGES ah.");
                        }
                        else
                            System.out.println("Mahadsanid!.");
                    }
//                    Qeybta_2aad_kaarka_hadalka_4aad_dooro_3aad
                    if (dooro==3) {
                        System.out.println(" Fadlan Geli Lacagta ");
                        int lacag = input.nextInt();
                        System.out.println(" Ma hubtaa inaad $" + lacag + " ku shubatid?\n" +
                                            "1. Haa\n" +
                                            "2. Maya");
                        int haa_maya = input.nextInt();
                        if (haa_maya == 1) {
                            if (lacag > haraa)
                                System.out.println("Tracnsaction amount must be less than 300");
                            else
                                System.out.println(" Waad ku guuleysatay inaad ku shubatid lacag dhan $" + lacag + "\n" +
                                                    " waxaad heshay unlimited DATA ah.");
                        }
                        else
                            System.out.println("Mahadsanid!.");
                    }
//                    Qeybta_2aad_kaarka_hadalka_4aad_dooro_4aad
                    if (dooro==4) {
                        System.out.println(" Fadlan Geli Lacagta ");
                        int lacag = input.nextInt();
                        System.out.println(" Ma hubtaa inaad $" + lacag + " ku shubatid?\n" +
                                            "1. Haa\n" +
                                            "2. Maya");
                        int haa_maya = input.nextInt();
                        if (haa_maya == 1) {
                            if (lacag > haraa)
                                System.out.println("Tracnsaction amount must be less than 300");
                            else
                                System.out.println(" Waad ku guuleysatay inaad ku shubatid lacag dhan $" + lacag + "\n" +
                                                    " waxaad heshay unlimited Maalinle ah.");
                        }
                        else
                            System.out.println("Mahadsanid!.");
                    }
//                    Qeybta_2aad_kaarka_hadalka_4aad_dooro_5aad
                    if (dooro==5) {
                        System.out.println(" Fadlan Geli Lacagta ");
                        int lacag = input.nextInt();
                        System.out.println(" Ma hubtaa inaad $" + lacag + " ku shubatid?\n" +
                                            "1. Haa\n" +
                                            "2. Maya");
                        int haa_maya = input.nextInt();
                        if (haa_maya == 1) {
                            if (lacag > haraa)
                                System.out.println("Tracnsaction amount must be less than 300");
                            else
                                System.out.println(" Waad ku guuleysatay inaad ku shubatid lacag dhan $" + lacag + "\n" +
                                                    " waxaad heshay unlimited Bille ah.");
                        }
                        else
                            System.out.println("Mahadsanid!.");
                    }
                }
                //                    Qeybta_2aad_kaarka_hadalka_5aad
                if (kaarkaHadalka==5){
                                  System.out.println("Fadlan Geli Mobile-ka");
                                  int mobile=input.nextInt();
                                  System.out.println("Fadlan Geli Lacagta");
                                  int lacag=input.nextInt();
                                  System.out.println("Ma hubtaa inaad $"+lacag+ " ugu shubtid \n" +
                                         "1. Haa\n" +
                                          "2. Maya");
                                  int haa_maya=input.nextInt();
                                  if (haa_maya==1) if (lacag>haraa)
                                      System.out.println("Transaction amount must be less than 300");
                                  else
                                       System.out.println("Waad ku guuleysatay inaad "+mobile+ " ugu shubtid lacag dhan $" + lacag);
                                  else
                                     System.out.println("Mahadsanid!.");

                }
                if (userOption==3){
                    System.out.println("end");
                }


            }
        }
    }
}


