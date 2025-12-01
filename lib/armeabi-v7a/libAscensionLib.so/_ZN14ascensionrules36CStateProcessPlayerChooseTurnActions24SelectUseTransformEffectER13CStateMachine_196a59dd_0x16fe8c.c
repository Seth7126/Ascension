// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions24SelectUseTransformEffectER13CStateMachineP6CStateiPj
// 地址: 0x16fe8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r5 = *(arg2 + 0x24c)
char* r7 = *(r5 + 4)
int32_t* r0_1 = core::CWorldBase::GetInstanceByID(r7)
core::CWorldBase::OutputMessageFormat(r7, "%s transforms %s\n", r5 + 0x10, (*(*r0_1 + 0xc))(r0_1))
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r7, r0_1, 1, 1, zx.d(*(r5 + 8)), 0xb, 0, 0)
int32_t r1_3 = *(r0_1[3] + 0xb8)

if (r1_3 s>= 1)
    if (zx.d(r7[0xb3d]) == 0 || *(r7 + 0xb48) s< 1)
        ascension::CPlayer::RemoveInsightCount(r5)
    else
        uint32_t r0_11 = zx.d(r7[0xb29])
        
        if (r0_11 != 0)
            r0_11 = 8
        
        ascensionrules::CreateStateMustPayResources(r5, r0_1, 0, 0, r1_3, r0_11, 8, 0)
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)

CState::CleanupEmbeddedState()
void** r7_2 = *(arg2 + 0x20)
CStateList::CStateList()
*r7_2 = _vtable_for_ascensionrules::CStateTransformCardFromHand + 8
r7_2[0xe] = r5
r7_2[0xf] = r0_1
r7_2[0xb].b = 0
CState::SetEmbeddedState(arg2)
return CStateList::AppendState(arg2) __tailcall
