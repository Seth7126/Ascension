// 函数: _ZN14ascensionrules39CStateMayAcquireOrDefeatTopOfCenterDeck16SelectRevealCardER13CStateMachineP6CStateiPj
// 地址: 0x132ca0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *(arg2 + 0x24c)
*(arg2 + 0x250) -= 1
void** r0_2 = operator new(0x2a4)
CGameStateOptions::CGameStateOptions(r0_2.b)
r0_2[0x94].w = 0
r0_2[0x96].w = 0
r0_2[0x93] = r6
*r0_2 = _vtable_for_ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck + 8
*(r0_2 + 0x252) = 0
r0_2[0x95] = 0
r0_2[0x97] = 0
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
