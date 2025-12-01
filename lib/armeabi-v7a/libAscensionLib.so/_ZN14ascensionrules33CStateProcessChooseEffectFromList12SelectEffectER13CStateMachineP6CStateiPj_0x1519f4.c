// 函数: _ZN14ascensionrules33CStateProcessChooseEffectFromList12SelectEffectER13CStateMachineP6CStateiPj
// 地址: 0x1519f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *(arg2 + 0x24c)
int32_t r10 = *(arg2 + 0x254)
int32_t r9 = *(arg2 + 0x258)
int32_t r7 = *(r6 + 4)
void** r0 = operator new(0x7a0)
CStateList::CStateList()
*r0 = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
r0[0xe] = r7
r0[0xf] = r6
r0[0x10] = arg3
r0[0x11] = r10
r0[0x12] = r9
r0[0x67] = 0
CState::SetEmbeddedStateBuffer(r0, 0x600)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
