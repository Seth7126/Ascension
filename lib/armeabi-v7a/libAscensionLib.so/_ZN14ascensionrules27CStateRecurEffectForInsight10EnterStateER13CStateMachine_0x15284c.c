// 函数: _ZN14ascensionrules27CStateRecurEffectForInsight10EnterStateER13CStateMachine
// 地址: 0x15284c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x24c)
void* r1 = *(r0 + 4)
void* r0_1 = *(r0 + 0x8c)

if (zx.d(*(r1 + 0xb3d)) != 0)
    uint32_t r3_1 = zx.d(*(r1 + 0xb29))
    void* r2_1 = *(r1 + 0xb48)
    
    if (r3_1 != 0)
        r1 = *(r1 + 0xb40)
    
    r0_1 += r2_1
    
    if (r3_1 != 0)
        r0_1 += r1

if (r0_1 s>= *(arg1 + 0x250))
    int32_t var_1c_1 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa0f0, "Recur", 
        ascensionrules::CStateRecurEffectForInsight::SelectRecurEffect)

int32_t var_1c_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa0f1, "Pass", 0)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
