// 函数: _ZN14ascensionrules44CStateProcessBanishMultipleFromHandOrDiscard22SelectBanishFromPlayedER13CStateMachineP6CStateiPj
// 地址: 0x137c28
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7 = *(arg2 + 0x24c)
*(arg2 + 0x25c) += 1
void** r0_2 = operator new(0x9c)
CState::CState()
*r0_2 = _vtable_for_ascensionrules::CStateProcessBanishSequence + 8
r0_2[0xc] = r7
r0_2[0xd] = arg3
r0_2[0xe] = 0xa
r0_2[0xf] = 0
r0_2[0x10].b = 0
r0_2[0x11] = _vtable_for_ascension::CEventBanishCard + 8
r0_2[0x12] = 0x1d
r0_2[0x13] = 0
r0_2[0x24] = r7
r0_2[0x25] = 0
r0_2[0x26] = 0
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
