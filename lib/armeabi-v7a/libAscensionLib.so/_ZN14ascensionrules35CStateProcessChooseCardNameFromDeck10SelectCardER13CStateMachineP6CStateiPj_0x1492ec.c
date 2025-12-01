// 函数: _ZN14ascensionrules35CStateProcessChooseCardNameFromDeck10SelectCardER13CStateMachineP6CStateiPj
// 地址: 0x1492ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

int32_t lr
int32_t var_4 = lr
void* r7 = *(arg2 + 0x24c)
char* r5 = *(r7 + 4)
core::CWorldBase::OutputMessageFormat(r5, "%s selects "%s"\n", r7 + 0x10, (*(*arg3 + 0xc))(arg3))
int32_t* r0_4 = *(arg2 + 0x250)

if (r0_4 != 0)
    void* r2_2 = r0_4 + *r0_4 + 4
    uint32_t r1_2 = zx.d(*r2_2)
    
    if (r1_2 u<= 7)
        uint32_t r3_1 = zx.d(*(arg3 + 8))
        *r2_2 = r1_2.b + 1
        r0_4[*r0_4 * 8 + r1_2 + 4] = r3_1

return ascension::CWorld::PushResolveEffect(r5, arg3) __tailcall
