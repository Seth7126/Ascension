// 函数: _ZN14ascensionrules29CStateMoveTreasureInCenterRow12BuildOptionsER13CStateMachine
// 地址: 0x130a34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t i_1 = *(arg1 + 0x254)
int32_t r5 = *(*(arg1 + 0x24c) + 4)
int32_t r12

if (i_1 == 0)
    int32_t r1
    int32_t var_2c_1 = r1
    
    for (int32_t i = 0; i != 7; i += 1)
        int32_t* r0_7 = ascension::CWorld::GetCenterRowCardStackList(r5)
        
        if (r0_7 != 0)
            int32_t r0_8 = *r0_7
            int32_t r9_1 = r0_7[1]
            
            if (r9_1 != r0_8)
                int32_t r5_1 = 0
                int32_t r10_1 = 0
                
                do
                    if (*(r9_1 - 4) == 3)
                        void* r2_3 = *(r9_1 - 8)
                        
                        if (r2_3 != 0)
                            void* r1_9 = *(r2_3 + 0xc)
                            
                            if ((r10_1 & 1) == 0 && *(r1_9 + 0xac) == 0)
                                void* var_34_1 = r2_3
                                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_3 + 8), 0xa02a, 
                                    "Move %s", 
                                    ascensionrules::CStateMoveTreasureInCenterRow::SelectTreasureToMove)
                                r10_1 = 1
                            label_130bbc:
                                
                                if ((r10_1 & 1) != 0 && (r5_1 & 1) != 0)
                                    break
                                
                                r0_8 = *r0_7
                            else
                                if ((r5_1 & 1) != 0)
                                    goto label_130bb8
                                
                                if (*(r1_9 + 0xac) != 0)
                                    void* var_34_2 = r2_3
                                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_3 + 8), 
                                        0xa02a, "Move %s", 
                                        ascensionrules::CStateMoveTreasureInCenterRow::SelectTreasureToMove)
                                label_130bb8:
                                    r5_1 = 1
                                    goto label_130bbc
                                
                                r5_1 = 0
                    
                    r9_1 -= 8
                while (r9_1 != r0_8)
    
    int32_t var_34_3 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 
        ascensionrules::CStateMoveTreasureInCenterRow::SelectNone)
    *(arg1 + 0x24c)
    r12 = *(*arg1 + 0x34)
else
    int32_t* r0_1 = ascension::CWorld::GetCenterRowCardStackList(r5)
    int32_t r4
    
    if (r0_1 != 0)
        int32_t* r0_2 = r0_1[1]
        
        do
            if (*r0_1 == r0_2)
                goto label_130aa0
            
            r0_2 -= 8
        while (*r0_2 != i_1)
        
        r4 = 0
        goto label_130da4
    
label_130aa0:
    int32_t* r0_4 = ascension::CWorld::GetCenterRowCardStackList(r5)
    
    if (r0_4 == 0)
    label_130c40:
        int32_t* r0_15 = ascension::CWorld::GetCenterRowCardStackList(r5)
        
        if (r0_15 == 0)
        label_130c78:
            int32_t* r0_18 = ascension::CWorld::GetCenterRowCardStackList(r5)
            
            if (r0_18 == 0)
            label_130cb0:
                int32_t* r0_21 = ascension::CWorld::GetCenterRowCardStackList(r5)
                
                if (r0_21 == 0)
                label_130ce8:
                    int32_t* r0_24 = ascension::CWorld::GetCenterRowCardStackList(r5)
                    
                    if (r0_24 == 0)
                    label_130d20:
                        int32_t* result = ascension::CWorld::GetCenterRowCardStackList(r5)
                        
                        if (result == 0)
                            return result
                        
                        int32_t r1_22 = *result
                        result = result[1]
                        
                        do
                            if (r1_22 == result)
                                return result
                            
                            result -= 8
                        while (*result != i_1)
                        
                        r4 = 6
                    else
                        int32_t* r0_25 = r0_24[1]
                        
                        do
                            if (*r0_24 == r0_25)
                                goto label_130d20
                            
                            r0_25 -= 8
                        while (*r0_25 != i_1)
                        
                        r4 = 5
                else
                    int32_t* r0_22 = r0_21[1]
                    
                    do
                        if (*r0_21 == r0_22)
                            goto label_130ce8
                        
                        r0_22 -= 8
                    while (*r0_22 != i_1)
                    
                    r4 = 4
            else
                int32_t* r0_19 = r0_18[1]
                
                do
                    if (*r0_18 == r0_19)
                        goto label_130cb0
                    
                    r0_19 -= 8
                while (*r0_19 != i_1)
                
                r4 = 3
        else
            int32_t* r0_16 = r0_15[1]
            
            do
                if (*r0_15 == r0_16)
                    goto label_130c78
                
                r0_16 -= 8
            while (*r0_16 != i_1)
            
            r4 = 2
    else
        int32_t* r0_5 = r0_4[1]
        
        do
            if (*r0_4 == r0_5)
                goto label_130c40
            
            r0_5 -= 8
        while (*r0_5 != i_1)
        
        r4 = 1
    
    void* r0_28 = ascension::CWorld::GetCenterRowCard(r5)
    
    if (r0_28 != 0)
        int32_t var_34_4 = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_28 + 8), 0xa02b, "Move Under %s", 
            ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)
    
    int32_t r7_1 = 1
    
    if (r4 == 1)
        goto label_130df4
    
label_130da4:
    void* r0_31 = ascension::CWorld::GetCenterRowCard(r5)
    
    if (r0_31 != 0)
        int32_t var_34_5 = 1
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_31 + 8), 0xa02b, "Move Under %s", 
            ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)
    
    int32_t r6_1 = 2
    r7_1 = r4
    int32_t r4_2
    
    if (r4 != 2)
    label_130df4:
        void* r0_34 = ascension::CWorld::GetCenterRowCard(r5)
        
        if (r0_34 != 0)
            int32_t var_34_6 = 2
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_34 + 8), 0xa02b, "Move Under %s", 
                ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)
        
        r4_2 = 3
        r6_1 = r7_1
        
        if (r7_1 == 3)
            goto label_130e94
        
        goto label_130e44
    
label_130e44:
    void* r0_37 = ascension::CWorld::GetCenterRowCard(r5)
    
    if (r0_37 != 0)
        int32_t var_34_7 = 3
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_37 + 8), 0xa02b, "Move Under %s", 
            ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)
    
    int32_t r7_2 = 4
    r4_2 = r6_1
    
    if (r6_1 != 4)
    label_130e94:
        void* r0_40 = ascension::CWorld::GetCenterRowCard(r5)
        
        if (r0_40 != 0)
            int32_t var_34_8 = 4
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_40 + 8), 0xa02b, "Move Under %s", 
                ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)
        
        r7_2 = r4_2
        
        if (r4_2 == 5)
            goto label_130f28
    
    void* r0_43 = ascension::CWorld::GetCenterRowCard(r5)
    
    if (r0_43 != 0)
        int32_t var_34_9 = 5
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_43 + 8), 0xa02b, "Move Under %s", 
            ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)
    
    if (r7_2 != 6)
    label_130f28:
        void* r0_46 = ascension::CWorld::GetCenterRowCard(r5)
        
        if (r0_46 != 0)
            int32_t var_34_10 = 6
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_46 + 8), 0xa02b, "Move Under %s", 
                ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)
    
    int32_t var_34_11 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa002, "Cancel", 
        ascensionrules::CStateMoveTreasureInCenterRow::SelectCancel)
    *(arg1 + 0x24c)
    r12 = *(*arg1 + 0x34)

jump(r12)
