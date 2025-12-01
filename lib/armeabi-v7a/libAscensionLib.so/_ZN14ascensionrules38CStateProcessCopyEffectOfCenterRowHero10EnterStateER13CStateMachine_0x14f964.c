// 函数: _ZN14ascensionrules38CStateProcessCopyEffectOfCenterRowHero10EnterStateER13CStateMachine
// 地址: 0x14f964
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x254)
int32_t r4 = 0
int32_t i = 0
int32_t r6 = *(*(arg1 + 0x24c) + 4)

if (r0 != 0)
    r4 = *(r0 + 0xc)

do
    void* r0_3 = ascension::CWorld::GetCenterRowCard(r6)
    
    if (r0_3 != 0)
        int32_t* r1_4 = *(r0_3 + 0xc)
        
        if (zx.d(*(r1_4 + 0xc9)) == 0 && r1_4[0x22] == 1 && (r1_4 != r4 || *(r6 + 0x30) u<= 0x10)
                && r1_4 != *(arg1 + 0x258))
            int32_t r2_3 = *(arg1 + 0x250)
            int32_t r3_2
            
            if (r2_3 s>= 1)
                r3_2 = 0x98
                
                if (*(r6 + 0x30) u< 0x14)
                    r3_2 = 0x9c
            
            if (r2_3 s< 1 || *(r1_4 + r3_2) s<= r2_3)
                int32_t i_1 = i
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_3 + 8), 0xa081, "Copy %s", 
                    ascensionrules::CStateProcessCopyEffectOfCenterRowHero::SelectEffectToCopy)
    
    i += 1
while (i != 7)

int32_t var_2c_1 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
