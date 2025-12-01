// 函数: _ZN14ascensionrules44CStateProcessBanishMultipleFromHandOrDiscard20SelectBanishFromHandER13CStateMachineP6CStateiPj
// 地址: 0x1378f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(arg2 + 0x24c)
bool cond:0 = *(arg2 + 0x258) == 0
*(arg2 + 0x25c) += 1

if (not(cond:0) && ascension::CPlayer::IsCardInHand(r5) != 0)
    int32_t* r0_3 = *(arg2 + 0x258)
    void* r2_1 = r0_3 + *r0_3 + 4
    uint32_t r1_4 = zx.d(*r2_1)
    
    if (r1_4 u<= 7)
        uint32_t r3 = zx.d(*(arg3 + 8))
        *r2_1 = r1_4.b + 1
        r0_3[*r0_3 * 8 + r1_4 + 4] = r3

void** r0_6 = operator new(0x9c)
CState::CState()
*r0_6 = _vtable_for_ascensionrules::CStateProcessBanishSequence + 8
r0_6[0xc] = r5
r0_6[0xd] = arg3
r0_6[0xe] = 1
r0_6[0xf] = 0
r0_6[0x10].b = 0
r0_6[0x11] = _vtable_for_ascension::CEventBanishCard + 8
r0_6[0x12] = 0x1d
r0_6[0x13] = 0
r0_6[0x24] = r5
r0_6[0x25] = 0
r0_6[0x26] = 0
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
