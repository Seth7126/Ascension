// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatTopOfCenterRowStack21SelectAcquireIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x134c18
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

arg1 = *(arg2 + 0x25c)

if (arg1 s< 1)
    return 

ascension::CPlayer* r10_1 = *(arg2 + 0x24c)
int32_t r7_1 = 0
int32_t r1 = 0
ascension::CActiveEffectInstance* r9_1 = *(r10_1 + 4)

do
    void* r2 = arg2 + r7_1
    
    if (*(r2 + 0x260) == arg3)
        void* r6 = *(r2 + 0x2a0)
        
        if (r6 == 0xffffffff)
            r6 = memchr(r2 + 0x280, 4, *(r2 + 0x27c)) - (r2 + 0x280)
        
        uint32_t r1_1 = zx.d(*(arg2 + r6 + r7_1 + 0x288))
        
        if (r1_1 != 0)
            if (zx.d(*(r9_1 + 0xb3d)) == 0 || *(r9_1 + 0xb48) s< 1)
                ascension::CPlayer::RemoveInsightCount(r10_1)
            else
                uint32_t r0_6 = zx.d(*(r9_1 + 0xb29))
                
                if (r0_6 != 0)
                    r0_6 = 8
                
                ascensionrules::CreateStateMustPayResources(r10_1, arg3, 0, 0, r1_1, r0_6, 8, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
        
        if (zx.d(*(arg2 + (r6 << 1) + r7_1 + 0x290)) != 0)
            core::CWorldBase::GetInstanceByID(r9_1)
            ascension::CWorld::PlayActiveEffect(r9_1)
        
        int32_t var_34_2 = 4
        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
            operator new(0x990), r10_1, arg3, 7, *(arg2 + 0x250))
        CState::AddOwnedChild(arg2)
        return CStateList::AppendState(arg2) __tailcall
    
    r1 += 1
    r7_1 += 0x44
while (r1 s< arg1)
