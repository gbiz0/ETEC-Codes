#include <stdio.h>

int main(){
// W quantidade de banana
// K preco da primeira banana
// N total de reais que o soldado possue	
// P total que o soldado deve pedir pro amigo
int w,k,n,p;
int custo = 0;
	printf("### informe ###\nA quantidade de bananas a ser compradas: ");
	scanf("%d", &w );

	printf("O preco da primeira banana: ");
	scanf("%d", &k);

	printf("Quantos reais voce possue: ");
	scanf("%d", &n);

// o programa aceita n = 0, porem nao aceitara n < 0
if(w > 0 && k > 0 && n >= 0){

	for(int i = 1; i <= w; i++){
		custo = custo + k*i;

	}
// lembrando que p é o valor que o soldado deve pedir emprestado
	p = n - custo;
	printf("O total a pagar é de %d, mas como voce tem apenas %d, voce ficara com %d", custo, n, p);
	if( p < 0){
		printf("\nPeca dinheiro emprestado a um amigo!\n");
	}
}else{
printf("voce informou algum valor invalido!\n");
}


return 0;
}
