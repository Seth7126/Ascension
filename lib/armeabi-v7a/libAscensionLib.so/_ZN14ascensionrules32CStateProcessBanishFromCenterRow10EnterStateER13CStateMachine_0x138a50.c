// 函数: _ZN14ascensionrules32CStateProcessBanishFromCenterRow10EnterStateER13CStateMachine
// 地址: 0x138a50
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i = 0
int32_t r6 = *(*(arg1 + 0x24c) + 4)

do
    int32_t r0_1 = *(arg1 + 0x254)
    int32_t r0_2
    
    if (r0_1 u<= 6)
        r0_2 = r0_1 - i
        
        if (r0_1 - i s< 0)
            r0_2 = 0 - r0_2
    
    if (r0_1 u> 6 || r0_2 == 1)
        void* r0_4 = ascension::CWorld::GetCenterRowCard(r6)
        
        if (r0_4 != 0)
            if (zx.d(*(arg1 + 0x260)) == 0)
            label_138b0c:
                
                if (ascension::CWorld::QueryCanBanish(r6, *(arg1 + 0x24c)) != 0)
                    int32_t i_1 = i
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_4 + 8), 0xa063, 
                        "Banish %s from center row", 
                        ascensionrules::CStateProcessBanishFromCenterRow::SelectCardToBanish)
            else
                int32_t* r0_7 = ascension::CWorld::GetCenterRowCardStackList(r6)
                
                if (r0_7 == 0)
                    goto label_138b0c
                
                int32_t r1_3 = *r0_7
                int32_t r0_8 = r0_7[1]
                
                if (r0_8 != r1_3)
                    while (*(r0_8 - 4) != 3)
                        r0_8 -= 8
                        
                        if (r1_3 == r0_8)
                            goto label_138b34
                    
                    goto label_138b0c
    
label_138b34:
    i += 1
while (i != 7)

void* r0_14

if (*(arg1 + 0x250) == 0)
    r0_14 = *arg1
else
    int32_t var_2c_1 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    r0_14 = *arg1

*(arg1 + 0x24c)
jump(*(r0_14 + 0x34))
