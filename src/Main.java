import familyTree.FamilyTree;
import human.Gender;
import human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree();
//        Human DSN_myFather, DSN_myMother, DAS_itsMe;
//        // (String fullName, Gender gender, LocalDate birthDate, LocalDate deathDate, Human father, Human mother, List<Human> children, String placeOfBith)
//
//        Human DN_myGrandFather = new Human("������� �.", Gender.Male, null, null, null, null, null/*DSN_myFather*/, null);
//        Human JA_myGrandMother = new Human("�������� �.", Gender.Male, null, null, null, null, null/*DSN_myFather*/, null);
//
        Human DSN_myFather, KLV_myMother, DAS_me, DVA_myDaughter, DYA_mySon;

        //Human(surname, name, patronymic, gender, birthDate, deathDate, father, mother, children, id)
        DSN_myFather = new Human("�������", "C", "�", Gender.Male, LocalDate.of(1949, 4, 4),
                LocalDate.of(1986, 7, 8), null, null, null, 0);
        KLV_myMother = new Human("���������", "�", "�", Gender.Female, LocalDate.of(1949, 9, 9),
                null, null, null, null, 0);

        DAS_me = new Human("�������", "�", "�", Gender.Male, LocalDate.of(1980, 6, 7),
                null, DSN_myFather, KLV_myMother, null, 0);

        DVA_myDaughter = new Human("��������", "�", "�", Gender.Female, LocalDate.of(2010, 2, 20),
                null, DAS_me, null, null, 0);

        DYA_mySon = new Human("�������", "�", "�", Gender.Male, LocalDate.of(2014, 2, 2),
                null, DAS_me, null, null, 0);

        DAS_me.addChildren(DVA_myDaughter);
        DAS_me.addChildren(DYA_mySon);
//        DAS_me.setChildren();
//      ����������� ��� �������� � ����� children, � ������ ������ ����� ���������� ������


        tree.addHuman(DSN_myFather);
        tree.addHuman(KLV_myMother);
        tree.addHuman(DAS_me);
        tree.addHuman(DVA_myDaughter);
        tree.addHuman(DYA_mySon);

        System.out.println(tree.getFamilyTreeInfo());
    }
}
