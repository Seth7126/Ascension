// 函数: _ZN14ascensionrules23CStateGainHonorForRunes15SelectGainHonorER13CStateMachineP6CStateiPj
// 地址: 0x1546b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *(arg2 + 0x254)
ascension::CPlayer* r8 = *(arg2 + 0x24c)

if (r2 s>= 1)
    int32_t r0 = *(r8 + 4)
    
    if (zx.d(*(r0 + 0xb2b)) != 0 && *(r0 + 0xb48) s>= 1)
        ascensionrules::CreateStateMustPayResources(r8, *(arg2 + 0x258), r2, 0, 0, 0, 2, 0)
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)
    else
        ascension::CWorld::RemoveCurrentTurnRunes(r0)

int32_t r7 = *(arg2 + 0x250)
int32_t r5 = *(arg2 + 0x258)
void** r0_5 = operator new(0x13c)
CState::CState()
*r0_5 = _vtable_for_ascensionrules::CStateGainHonor + 8
r0_5[0xc] = r8
r0_5[0xd] = r5
r0_5[0xe] = r7
r0_5[0xf].b = 0
r0_5[0x10] = _vtable_for_ascension::CEventGainHonor + 8
r0_5[0x11] = 0x1c
r0_5[0x12] = 0
r0_5[0x23] = r8
r0_5[0x24] = 0
r0_5[0x25] = 0
r0_5[0x26] = 0
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
