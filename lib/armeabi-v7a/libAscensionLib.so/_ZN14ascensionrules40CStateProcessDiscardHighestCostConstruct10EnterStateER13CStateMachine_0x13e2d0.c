// 函数: _ZN14ascensionrules40CStateProcessDiscardHighestCostConstruct10EnterStateER13CStateMachine
// 地址: 0x13e2d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg1 + 0x24c)
*(arg1 + 0x250) = 0
int32_t* i = *(r2 + 0x54)
int32_t r0 = *(r2 + 0x58)

if (i != r0)
    void* r10_1 = *(r2 + 4)
    int32_t r4_1 = 0xffffffff
    int32_t* i_1 = i
    int32_t r6_1 = *(r10_1 + 0x30)
    
    do
        int32_t r3_1 = r4_1
        int32_t* r4_2 = *(*(*i_1 + 0x10) + 0xc)
        int32_t r5_3 = 0x98
        
        if (r6_1 u< 0x14)
            r5_3 = 0x9c
        
        int32_t r5_4 = *(r4_2 + r5_3)
        
        if (r5_4 s< 1)
            r5_4 = r4_2[0x2c]
        else if (r6_1 u>= 0x19)
            r5_4 += r4_2[0x28]
        
        r4_1 = r3_1
        
        if (r5_4 s> r3_1)
            r4_1 = r5_4
        
        i_1 = &i_1[1]
        
        if (r5_4 s<= 0)
            r4_1 = r3_1
    while (r0 != i_1)
    
    if (i != r0)
        do
            void* r0_1 = *i
            int32_t* r3_2 = *(*(r0_1 + 0x10) + 0xc)
            int32_t r1_3 = 0x98
            
            if (r6_1 u< 0x14)
                r1_3 = 0x9c
            
            int32_t r1_4 = *(r3_2 + r1_3)
            
            if (r1_4 s>= 1)
                if (*(r10_1 + 0x30) u>= 0x19)
                    r1_4 += r3_2[0x28]
                
                if (r1_4 == r4_1)
                    goto label_13e3d4
            else if (r3_2[0x2c] == r4_1)
            label_13e3d4:
                void* var_2c_1 = r0_1
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_1 + 8), 0xa051, "Discard %s", 
                    ascensionrules::CStateProcessDiscardHighestCostConstruct::SelectConstructToDiscard)
                r2 = *(arg1 + 0x24c)
            
            i = &i[1]
        while (i != *(r2 + 0x58))

jump(*(*arg1 + 0x34))
