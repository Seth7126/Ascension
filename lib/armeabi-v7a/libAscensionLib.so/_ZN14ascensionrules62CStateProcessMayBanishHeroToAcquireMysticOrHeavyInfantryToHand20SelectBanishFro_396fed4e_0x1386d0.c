// 函数: _ZN14ascensionrules62CStateProcessMayBanishHeroToAcquireMysticOrHeavyInfantryToHand20SelectBanishFromHandER13CStateMachineP6CStateiPj
// 地址: 0x1386d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r5 = *(arg2 + 0x24c)
void** r0 = operator new(0x9c)
CState::CState()
*r0 = _vtable_for_ascensionrules::CStateProcessBanishSequence + 8
r0[0xc] = r5
r0[0xd] = arg3
r0[0xe] = 1
r0[0xf] = 0
r0[0x10].b = 0
r0[0x11] = _vtable_for_ascension::CEventBanishCard + 8
r0[0x12] = 0x1d
r0[0x13] = 0
r0[0x24] = r5
r0[0x25] = 0
r0[0x26] = 0
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
ascensionrules::CreateStateProcessAcquireMysticOrHeavyInfantry(r5, 0, 1, 1, 1, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
