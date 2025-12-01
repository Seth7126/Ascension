// 函数: _ZN14ascensionrules27CStateProcessChooseHeroName10SelectCardER13CStateMachineP6CStateiPj
// 地址: 0x149a0c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

void* r7_1 = *(arg2 + 0x24c)
core::CWorldBase::OutputMessageFormat(*(r7_1 + 4), "%s selects "%s"\n", r7_1 + 0x10, 
    (*(*arg3 + 0xc))(arg3))
arg1 = *(arg2 + 0x250)

if (arg1 == 0)
    return 

void* r2_2 = arg1 + *arg1 + 4
uint32_t r1_2 = zx.d(*r2_2)

if (r1_2 u> 7)
    return 

uint32_t r3_1 = zx.d(*(arg3 + 8))
*r2_2 = r1_2.b + 1
*(arg1 + (*arg1 << 5) + (r1_2 << 2) + 0x10) = r3_1
