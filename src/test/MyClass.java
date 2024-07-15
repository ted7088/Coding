package test;

import java.util.Scanner;


public class MyClass {
	public static void main(String args[]) {
		/* [1]. 사용 배열: 4 X 3 모양의 MBTI 질문 배열 */
        String[][] questions = {
            // E와 I를 판가름 하는 문제다. true 일시 E, false 일시 I
            {"나는 활발하다",
            "나는 처음 보는 사람과 쉽게 친해진다",
            "친구들이 나를 빼놓고 놀면 섭섭하다"},
            // N와 S를 판가름 하는 문제다. true 일시 S, false 일시 N
            {"나는 현실적이라는 소리를 많이 듣는다",
            "숲 보다는 나무를 보는 편이다",
            "미래에 일어날 일에 대해 상상하기 보다는 이미 일어난 것을 토대로 미래를 예측하는 것을 좋아한다"},
            // F와 T를 판가름 하는 문제다. true 일시 T, false 일시 F
            {"친구가 고민상담을 하면 위로보다는 현실적인 조언을 통해 친구가 빨리 일을 해결할 수 있게끔 한다",
            "친구가 사고가 났다고 카톡이 왔다.\"야 괜찮아?\" 가 아니라 \"어디서 어쩌다? 니 과실이야?\"라고 한다.",
            "친구가 기분나빠할 까봐 쓴소리를 돌려말하기 보다는 직설적으로 얘기하는 편이다"},
            // J와 P를 판가름 하는 문제다. true 일시 P, false 일시 J
            {"내일은 없다, 오늘이 중요하다",
            "계획하는 것을 싫어한다",
            "먹을 걸 정할 때, 2차는 어디로.. 만약 여기 닫으면 어디로.. b플랜 c플랜까지 짠다."}
        };
        String MBTI[] = new String[4];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("True와 False 중 선택하세요\n");

        for(int i=0; i<4; i++) {
        	int answerCount=0;
        	System.out.print((i+1)+"번째 유형 검사중... \n");
            for(int j=0; j<3; j++) {
                System.out.println(questions[i][j]);
                System.out.print("당신의 선택은? : ");
                boolean question = sc.nextBoolean();
                
                if (question==true) {
                	++answerCount;
                } else {
                	--answerCount;
                }
            }
            System.out.println("!!!!!!!!!!!!!"+answerCount);
        	MBTI[0] = (answerCount > 0) ? "E" : "I";	
        	MBTI[1] = (answerCount > 0) ? "S" : "N";	
        	MBTI[2] = (answerCount > 0) ? "T" : "F";	
        	MBTI[3] = (answerCount > 0) ? "P" : "J";
        	System.out.println("이거의 변화를 잘 보기"+MBTI[0]);
        }
        System.out.println("당신의 MBTI 유형: " + MBTI[0] + MBTI[1] + MBTI[2] + MBTI[3]);
    }
}