// 函数: _ZN14ascensionrules44CStateProcessBanishFromHandOrDiscardOrSource20SelectBanishFromHandER13CStateMachineP6CStateiPj
// 地址: 0x136ecc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = *(arg2 + 0x260)
int32_t r7 = *(arg2 + 0x24c)

if (r0 != 0)
    void* r2_1 = r0 + *r0 + 4
    uint32_t r1_1 = zx.d(*r2_1)
    
    if (r1_1 u<= 7)
        uint32_t r3 = zx.d(*(arg3 + 8))
        *r2_1 = r1_1.b + 1
        r0[*r0 * 8 + r1_1 + 4] = r3 | 0x610000 | 0xa0000000

void** r0_3 = operator new(0x9c)
CState::CState()
*r0_3 = _vtable_for_ascensionrules::CStateProcessBanishSequence + 8
r0_3[0xc] = r7
r0_3[0xd] = arg3
r0_3[0xe] = 1
r0_3[0xf] = 0
r0_3[0x10].b = 0
r0_3[0x11] = _vtable_for_ascension::CEventBanishCard + 8
r0_3[0x12] = 0x1d
r0_3[0x13] = 0
r0_3[0x24] = r7
r0_3[0x25] = 0
r0_3[0x26] = 0
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
