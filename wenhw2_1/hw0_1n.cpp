#include <stdio.h> //輸入與輸出用 <stdio.h>

void dinner(int wen, int ren);
void stroll(int wen, int ren);
void bathroom(int wen, int ren);

int main()
{
    int scn, wen, ren;
    while (1)
    {
        printf("please enter 0-4\n");
        printf("0 : break while ,1 : dinner \n");
        printf("2 : take a walk ,3 : bathroom\n");

        scanf("%d", &scn);

        if (scn == 0)
        {
            printf("the end !! no i say no\n");
            break;
        }
        else if (scn == 1)
        {
            printf("please enter wens mon\n");
            scanf("%d", &wen);
            printf("please enter rens mon\n");
            scanf("%d", &ren);
            dinner(wen, ren);
        }
        else if (scn == 2)
        {
            printf("1 = wen ok , 0 = wennie not ok\n");
            scanf("%d", &wen);
            printf("1 = ren ok , 0 = ren not ok\n");
            scanf("%d", &ren);
            stroll(wen, ren);
        }
        else
        {
            printf("1 = wen ok , 0 = wennie not ok\n");
            scanf("%d", &wen);
            printf("1 = ren ok , 0 = ren not ok\n");
            scanf("%d", &ren);
            bathroom(wen, ren);
        }
        printf("\n\n");
    }
    return 0;
}

void dinner(int wen, int ren)
{
    if ((wen == ren) && (ren != 0))
    {
        printf("both have money but i believe you bring enough\n");
        printf("lets go fucking dinner\n");
    }
    else
    {
        printf("可能無法\n");
    }
}

void stroll(int wen, int ren)
{
    if ((wen == 1) || (ren == 1))
    {
        printf("兩個en其中一個要\n");
        printf("lets go to walk and 課金\n");
    }
    else
    {
        printf("maybe 大家在睡覺可能要改天\n");
    }
}

void bathroom(int wen, int ren)
{
    if ((wen == 1) ^ (ren == 1))
    {
        printf("//有一個人上\n");
        printf("慢慢來\n");
    }
    else
    {
        printf("都不要上阿(原句)\n");
        printf("世說可以憶起去學校上壓表哥\n");
    }
}
