// 函数: _ZN14ascensionrules30CStatePlayVisionFromDreamscape10EnterStateER13CStateMachine
// 地址: 0x16b35c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = *(arg1 + 0x34)
void* r7 = *(r1 + 0xc)
core::CCardInstance* r6 = *(*(arg1 + 0x30) + 4)

if (zx.d(*(r7 + 0xd4)) == 0)
    ascension::CWorld::AddToPlayedCards(r6, r1)
    ascension::CWorld::PushResolveEffect(r6, *(arg1 + 0x34))
    *(arg1 + 0x34)
    ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 1)

ascension::CEffect* r2_4 = *(r7 + 0xe8)

if (r2_4 != 0)
    *(arg1 + 0x38) = ascensionrules::CreateStateProcessCardEffect(r6, *(arg1 + 0x30), r2_4, 
        *(arg1 + 0x34), nullptr, arg1 + 0x3c, 0x800)
    CState* entry_r1
    CStateMachine::PushState(entry_r1)

*(arg1 + 0x83c) = 1
return 1
