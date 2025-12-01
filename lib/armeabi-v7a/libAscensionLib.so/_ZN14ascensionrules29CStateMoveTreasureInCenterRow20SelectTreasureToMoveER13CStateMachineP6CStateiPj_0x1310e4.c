// 函数: _ZN14ascensionrules29CStateMoveTreasureInCenterRow20SelectTreasureToMoveER13CStateMachineP6CStateiPj
// 地址: 0x1310e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r4 = *(arg2 + 0x24c)
int32_t r7 = *(r4 + 4)
int32_t* r0_1 = ascension::CWorld::GetCenterRowCardStackList(r7)
void* var_28 = r4
int32_t r9

if (r0_1 != 0)
    int32_t* r0_2 = r0_1[1]
    
    do
        if (*r0_1 == r0_2)
            goto label_131150
        
        r0_2 -= 8
    while (*r0_2 != arg3)
    
    r9 = 0
    *(arg2 + 0x254) = arg3
    *(arg2 + 0x258) = 0
    goto label_1312f4

label_131150:
int32_t* r0_4 = ascension::CWorld::GetCenterRowCardStackList(r7)

if (r0_4 == 0)
label_131188:
    int32_t* r0_7 = ascension::CWorld::GetCenterRowCardStackList(r7)
    
    if (r0_7 == 0)
    label_1311c0:
        int32_t* r0_10 = ascension::CWorld::GetCenterRowCardStackList(r7)
        
        if (r0_10 == 0)
        label_1311f8:
            int32_t* r0_13 = ascension::CWorld::GetCenterRowCardStackList(r7)
            
            if (r0_13 == 0)
            label_131230:
                int32_t* r0_16 = ascension::CWorld::GetCenterRowCardStackList(r7)
                
                if (r0_16 == 0)
                label_131268:
                    int32_t* result = ascension::CWorld::GetCenterRowCardStackList(r7)
                    
                    if (result == 0)
                        return result
                    
                    int32_t r1_13 = *result
                    result = result[1]
                    
                    do
                        if (r1_13 == result)
                            return result
                        
                        result -= 8
                    while (*result != arg3)
                    
                    r9 = 6
                else
                    int32_t* r0_17 = r0_16[1]
                    
                    do
                        if (*r0_16 == r0_17)
                            goto label_131268
                        
                        r0_17 -= 8
                    while (*r0_17 != arg3)
                    
                    r9 = 5
            else
                int32_t* r0_14 = r0_13[1]
                
                do
                    if (*r0_13 == r0_14)
                        goto label_131230
                    
                    r0_14 -= 8
                while (*r0_14 != arg3)
                
                r9 = 4
        else
            int32_t* r0_11 = r0_10[1]
            
            do
                if (*r0_10 == r0_11)
                    goto label_1311f8
                
                r0_11 -= 8
            while (*r0_11 != arg3)
            
            r9 = 3
    else
        int32_t* r0_8 = r0_7[1]
        
        do
            if (*r0_7 == r0_8)
                goto label_1311c0
            
            r0_8 -= 8
        while (*r0_8 != arg3)
        
        r9 = 2
else
    int32_t* r0_5 = r0_4[1]
    
    do
        if (*r0_4 == r0_5)
            goto label_131188
        
        r0_5 -= 8
    while (*r0_5 != arg3)
    
    r9 = 1

*(arg2 + 0x254) = arg3
*(arg2 + 0x258) = r9
void* r0_20 = ascension::CWorld::GetCenterRowCard(r7)

if (r0_20 != 0)
    int32_t var_2c_1 = 0
    CGameStateOptions::AddSimpleUserOption(arg2.w, *(r0_20 + 8), 0xa02b, "Move Under %s", 
        ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)

int32_t r4_1 = 1

if (r9 == 1)
    goto label_131344

label_1312f4:
void* r0_23 = ascension::CWorld::GetCenterRowCard(r7)

if (r0_23 != 0)
    int32_t var_2c_2 = 1
    CGameStateOptions::AddSimpleUserOption(arg2.w, *(r0_23 + 8), 0xa02b, "Move Under %s", 
        ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)

int32_t r8_1 = 2
r4_1 = r9
int32_t r5_1

if (r9 != 2)
label_131344:
    void* r0_26 = ascension::CWorld::GetCenterRowCard(r7)
    
    if (r0_26 != 0)
        int32_t var_2c_3 = 2
        CGameStateOptions::AddSimpleUserOption(arg2.w, *(r0_26 + 8), 0xa02b, "Move Under %s", 
            ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)
    
    r5_1 = 3
    r8_1 = r4_1
    
    if (r4_1 == 3)
        goto label_1313e4
    
    goto label_131394

label_131394:
void* r0_29 = ascension::CWorld::GetCenterRowCard(r7)

if (r0_29 != 0)
    int32_t var_2c_4 = 3
    CGameStateOptions::AddSimpleUserOption(arg2.w, *(r0_29 + 8), 0xa02b, "Move Under %s", 
        ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)

int32_t r4_2 = 4
r5_1 = r8_1

if (r8_1 != 4)
label_1313e4:
    void* r0_32 = ascension::CWorld::GetCenterRowCard(r7)
    
    if (r0_32 != 0)
        int32_t var_2c_5 = 4
        CGameStateOptions::AddSimpleUserOption(arg2.w, *(r0_32 + 8), 0xa02b, "Move Under %s", 
            ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)
    
    r4_2 = r5_1
    
    if (r5_1 == 5)
        goto label_131478

void* r0_35 = ascension::CWorld::GetCenterRowCard(r7)

if (r0_35 != 0)
    int32_t var_2c_6 = 5
    CGameStateOptions::AddSimpleUserOption(arg2.w, *(r0_35 + 8), 0xa02b, "Move Under %s", 
        ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)

if (r4_2 != 6)
label_131478:
    void* r0_38 = ascension::CWorld::GetCenterRowCard(r7)
    
    if (r0_38 != 0)
        int32_t var_2c_7 = 6
        CGameStateOptions::AddSimpleUserOption(arg2.w, *(r0_38 + 8), 0xa02b, "Move Under %s", 
            ascensionrules::CStateMoveTreasureInCenterRow::SelectMoveLocation)

int32_t var_2c_8 = 0
CGameStateOptions::AddSimpleUserOption(arg2.w, 0, 0xa002, "Cancel", 
    ascensionrules::CStateMoveTreasureInCenterRow::SelectCancel)
jump(*(*arg2 + 0x34))
