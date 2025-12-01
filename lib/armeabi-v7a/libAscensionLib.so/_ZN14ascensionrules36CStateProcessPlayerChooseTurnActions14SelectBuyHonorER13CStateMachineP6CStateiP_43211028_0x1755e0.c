// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions14SelectBuyHonorER13CStateMachineP6CStateiPj
// 地址: 0x1755e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r8 = *(arg2 + 0x24c)
uint32_t r7 = *(r8 + 4)
*(r7 + 0x30)
ascension::CWorld::RemoveConvertRunesToHonorCard(r7)

if (0 == arg3 u>> 0x18)
    return 0

uint32_t r6_1 = arg3 u>> 0x18
core::CInstance* r0_2 = core::CWorldBase::GetInstanceByID(r7)

if (zx.d(*(r7 + 0xb2b)) == 0 || *(r7 + 0xb48) s< 1)
    ascension::CWorld::RemoveCurrentTurnRunes(r7)
else
    ascensionrules::CreateStateMustPayResources(r8, r0_2, r6_1, 0, 0, 0, 2, 0)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)

ascensionrules::CreateStateGainHonor(r8, nullptr, r6_1, false, nullptr, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
