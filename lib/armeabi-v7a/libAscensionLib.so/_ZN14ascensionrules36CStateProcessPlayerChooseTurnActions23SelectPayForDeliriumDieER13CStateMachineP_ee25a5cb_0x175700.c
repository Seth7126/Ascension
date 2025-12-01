// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions23SelectPayForDeliriumDieER13CStateMachineP6CStateiPj
// 地址: 0x175700
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r5 = *(arg2 + 0x24c)
void* r0 = *(r5 + 4)

if (zx.d(*(r0 + 0xb3d)) == 0 || *(r0 + 0xb48) s< 1)
    ascension::CPlayer::RemoveInsightCount(r5)
else
    uint32_t r0_1 = zx.d(*(r0 + 0xb29))
    
    if (r0_1 != 0)
        r0_1 = 8
    
    ascensionrules::CreateStateMustPayResources(r5, *(r0 + 0xa88), 0, 0, 5, r0_1, 8, 0)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)

ascensionrules::CreateStateRollDeliriumDie(r5, nullptr, nullptr, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
