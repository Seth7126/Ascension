// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions33SelectAcquireFromAvailableUniquesER13CStateMachineP6CStateiPj
// 地址: 0x172bcc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r5 = *(arg2 + 0x24c)
uint32_t r7 = *(r5 + 4)
core::CInstance* result = core::CWorldBase::GetInstanceByID(r7)

if (result != 0)
    core::CInstance* result_1 = result
    result = *(arg2 + 0x254)
    
    if (result s>= 1)
        void* __offset(CState, 0x26c) r1_1 = arg2 + 0x26c
        int32_t r2 = 0
        
        do
            if (*(r1_1 - 0x14) == result_1)
                int32_t r8 = *r1_1
                
                if (r8 s< 1 || zx.d(*(r7 + 0xb3d)) == 0 || *(r7 + 0xb48) s< 1)
                    ascension::CPlayer::RemoveInsightCount(r5)
                else
                    uint32_t r0_3 = zx.d(*(r7 + 0xb29))
                    
                    if (r0_3 != 0)
                        r0_3 = 8
                    
                    ascensionrules::CreateStateMustPayResources(r5, result_1, 0, 0, r8, r0_3, 8, 0)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                int32_t var_30_2 = r8
                ascension::CWorld::OutputEvent(r7, 0x43, zx.d(*(r5 + 8)), zx.d(*(result_1 + 8)))
                ascensionrules::CreateStateProcessAcquireCardSequence(r5, result_1, 0x1b, 0, 3, 
                    nullptr, 0)
                CState::AddOwnedChild(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r2 += 1
            r1_1 += 0x44
        while (r2 s< result)

return result
