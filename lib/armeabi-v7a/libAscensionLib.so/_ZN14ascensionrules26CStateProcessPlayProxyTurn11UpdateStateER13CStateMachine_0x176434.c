// 函数: _ZN14ascensionrules26CStateProcessPlayProxyTurn11UpdateStateER13CStateMachine
// 地址: 0x176434
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = *(arg1 + 0x30)
int32_t r0 = *(r6 + 4)
CState* entry_r1

if (zx.d(*(r0 + 0xa14)) != 0 && *(*(r0 + 0x14) + 4) != *(r6 + 0xc))
    void** r5
    
    if (zx.d(*(arg1 + 0x34)) != 0)
        *(arg1 + 0x34) = 0
        r5 = operator new(0x134)
        CStateList::CStateList()
        r5[0xe] = r6
        *r5 = _vtable_for_ascensionrules::CStateProcessPlayerTurnEnd + 8
        r5[0xf].w = 0x101
        r5[0x10] = _vtable_for_ascension::CEventTurnSequence + 8
        r5[0x11] = 0x10
        r5[0x12] = 0
        r5[0x23] = 0
        r5[0x24] = 2
        return CStateMachine::PushOwnedState(entry_r1) __tailcall
    
    if (zx.d(*(arg1 + 0x35)) != 0)
        *(arg1 + 0x35) = 0
        int32_t r0_5 = ascension::CWorld::GetPlayerByIndex(r0)
        r5 = operator new(0x1cc)
        CStateList::CStateList()
        r5[0xe] = r0_5
        *r5 = _vtable_for_ascensionrules::CStateProcessPlayerTurn + 8
        r5[0xf].b = 0
        r5[0x10] = _vtable_for_ascension::CEventTurnSequence + 8
        r5[0x11] = 0x10
        r5[0x12] = 0
        r5[0x23] = 0
        r5[0x24] = 1
        r5[0x72].b = 0
        return CStateMachine::PushOwnedState(entry_r1) __tailcall

return CStateMachine::PopState(entry_r1) __tailcall
