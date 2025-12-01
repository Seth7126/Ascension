// 函数: _ZN14ascensionrules23CStateGainHonorForRunes10EnterStateER13CStateMachine
// 地址: 0x1545dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1 = *(*(arg1 + 0x24c) + 4)
int32_t r0_1 = *(r1 + 0xb40)

if (zx.d(*(r1 + 0xb2b)) != 0)
    r0_1 += *(r1 + 0xb48)

if (r0_1 s>= *(arg1 + 0x254))
    sprintf(arg1 + 0x25c, "Gain %d Honor", *(arg1 + 0x250))
    int32_t var_1c_1 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa080, arg1 + 0x25c, 
        ascensionrules::CStateGainHonorForRunes::SelectGainHonor)

int32_t var_1c_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "Pass", 0)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
